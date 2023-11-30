package com.viewnext.service;

import com.viewnext.dao.HotelesDao;
import com.viewnext.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jose Moreno
 */
@Service
public class HotelesServiceImpl implements HotelesService{

    @Autowired
    HotelesDao dao;

    /**
     *
     * @return nos devuelte una lista de todos los hoteles con su informacion
     */
    @Override
    public List<Hotel> hoteles() {
        return dao.findAll();
    }

    /**
     *
     * @return nos devuelve una lista de los hoteles disponibles con su informacion
     * en este metodo no recurrimos a hacer query en el dao y hacemos la logica aqui
     */
    @Override
    public List<Hotel> hotelesDisponibles() {
        List<Hotel> hoteles = dao.findAll();
        return hoteles.stream().filter(Hotel::getDisponible).collect(Collectors.toList());
    }

    /**
     *
     * @param nombre -> nombre del hotel que queremos buscar
     * @return nos devuelve la informacion del hotel que queremos buscas
     * Hacemos uso de una query que hemos creado en {@link HotelesDao#encontrarPorNombre(String)}  modo ejemplo
     * para ver como podemos hacer consultas tambien con JSQL
     */
    @Override
    public Hotel getHotel(String nombre) {
        return dao.encontrarPorNombre(nombre);
    }
}
