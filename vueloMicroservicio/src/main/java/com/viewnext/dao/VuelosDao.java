package com.viewnext.dao;

import com.viewnext.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * @author Jose Moreno
 */
public interface VuelosDao extends JpaRepository<Vuelo,Integer> {

    /**
     * Consulta que selecciona todos los vuelos que tiene plazas igual o
     * superior al numero de plazas indicadas en el param
     * @param plazas -> cantidad de plazas con las que preguntamso
     * @return devuelve una lista de vuelos que tiene plazas suficientes
     */
    @Query("SELECT v FROM Vuelo v WHERE v.plazasdisponibles >= :plazas")
    List<Vuelo> encontrarPorPlaza(@Param("plazas") int plazas);

}
