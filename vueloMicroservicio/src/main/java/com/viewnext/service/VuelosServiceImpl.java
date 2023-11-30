package com.viewnext.service;

import com.viewnext.dao.VuelosDao;
import com.viewnext.model.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author Jose Moreno
 */
@Service
public class VuelosServiceImpl implements VuelosService{
    @Autowired
    VuelosDao dao;

    /**
     *
     * @param plazas -> cantidad de plazas que queremos consultar
     * @return devulve una lista con los vuelos que hay disponible con esa cantidad de plazas
     * hacemos uso de una query que hemos creado en el dao {@link VuelosDao#encontrarPorPlaza(int)}
     */
    @Override
    public List<Vuelo> vuelosPorPlaza(int plazas) {
        return dao.encontrarPorPlaza(plazas);
    }

    /**
     *
     * @param idvuelo --> pasamos el id del vuelo que queremos actualizar
     * @param plazasreservadas --> pasamos la cantidad de plazas que queremos reservar
     * en este caso en vez de hacer una query haremos la logica en el metodo este para
     * actualizar
     */
    @Override
    public void actualizaVuelo(int idvuelo, int plazasreservadas) {
        Vuelo vuelo = dao.findById(idvuelo).orElse(null);

        vuelo.setPlazasdisponibles(vuelo.getPlazasdisponibles()-plazasreservadas);
        dao.save(vuelo);
    }

    /**
     *
     * @return nos devuelve una lista con todos los vuelos
     * {@link VuelosDao#findAll()}
     */
    @Override
    public List<Vuelo> vuelos() {
        return dao.findAll();
    }
}
