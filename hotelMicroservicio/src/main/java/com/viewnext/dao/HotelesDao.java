package com.viewnext.dao;

import com.viewnext.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author Jose Moreno
 */
public interface HotelesDao extends JpaRepository<Hotel,Integer> {

    /**
     *
     * @param nombre -> pasamos el nombre del hotel al que queremos hacer la consulta
     * @return nos devuelve todos los hoteles que coincidan con el nombre pasado por variable
     */
    @Query("SELECT p FROM Hotel p WHERE p.nombre = :nombre")
    Hotel encontrarPorNombre(@Param("nombre") String nombre);

}
