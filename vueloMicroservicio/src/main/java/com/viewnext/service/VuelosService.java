package com.viewnext.service;

import com.viewnext.model.Vuelo;

import java.util.List;

/**
 * @author Jose Moreno
 */
public interface VuelosService {

    /**
     *
     * @param plazas -> cantidad de plazas que queremos consultar
     * @return nos devuelve una lista de companias que tienen disponilble las plazas que se le
     * pasa por parametro
     */
    List<Vuelo> vuelosPorPlaza(int plazas);

    /**
     * actualiza los datos de la cantidad de plazas que quedan en un vuelo tras pasar una
     * cantidad de reservas
     * @param idvuelo --> pasamos el id del vuelo que queremos actualizar
     * @param plazasreservadas --> pasamos la cantidad de plazas que queremos reservar
     */
    void actualizaVuelo(int idvuelo, int plazasreservadas);

    /**
     *
     * @return nos devuelve una lista con todos los vuelos
     */
    List<Vuelo> vuelos();

}
