package com.viewnext.service;

import com.viewnext.dao.ReservasDao;
import com.viewnext.model.Hotel;
import com.viewnext.model.Res;
import com.viewnext.model.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jose Moreno
 */
@Service
public class ReservasServiceImpl implements ReservasService{

    @Autowired
    ReservasDao dao;
    @Autowired
    RestTemplate template;

    /**
     * Url declara para hacer peticiones al microservicio hotel
     */
    private String urlHotel = "http://localhost:8000/hoteles/";
    /**
     * Url declara para hacer peticiones al microservicio vuelo
     */
    private String urlVuelo = "http://localhost:9000/vuelos/";

    /**
     * por un lado creamos una nueva reserva con {@link ReservasDao#save(Object)}
     * por otro lado actualizamos el campo de totalreservas del microservicio de vuelo
     * con un template.put
     * @param reserva -> pasamos un objeto de tipo reserva
     */
    @Override
    public void altaReserva(Reserva reserva) {
        dao.save(reserva);
        template.put(urlVuelo+"{idvuelo}/{totalreservas}",null,reserva.getIdvuelo(),reserva.getTotalreservas());
    }

    /**
     *
     * @return nos devuelve uan lista con todas las reservas
     * hacemos uso de {@link ReservasDao#findAll()}
     */
    @Override
    public List<Reserva> reservas() {
        return dao.findAll();
    }

    /**
     *
     * @param nombre -> nombre del hotel
     * @return nos devuelve una lista de las reservas que hay del hotel = :nombre
     * por un lado creamos un objeto de tipo hotel que mediante template.getForObject obtenemos
     * el valor de la idhotel desde el microservicio de hotel y mediante el nombre que le pasamos
     * Una vez con el idhotel recorremos la lista de reservas con un stream y obtenemos las reservas
     * con ese hotel.
     * Por ultimo creamos una nueva lista donde vamos complentandola con {@link Res} que la creamos para
     * pasar solo los parametros que pedian
     */
    @Override
    public List<Res> reservasPorHotel(String nombre) {
        Hotel hotel = template.getForObject(urlHotel + nombre, Hotel.class);
        int idHotel = hotel.getIdhotel();
        List<Reserva> todasLasReservas = dao.findAll();
        List<Reserva> reservasDelHotel = todasLasReservas.stream()
                .filter(reservas -> reservas.getIdhotel() == idHotel)
                .collect(Collectors.toList());

        List<Res> finales = reservasDelHotel.stream().map(reservas -> {
            Res res = new Res();
            res.setDni(reservas.getDni());
            res.setIdvuelo(reservas.getIdvuelo());
            res.setNombre(reservas.getNombrecliente());
            return res;
        }).collect(Collectors.toList());

        return finales;
    }
}
