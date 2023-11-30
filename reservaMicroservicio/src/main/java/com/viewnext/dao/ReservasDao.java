package com.viewnext.dao;

import com.viewnext.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jose Moreno
 */
public interface ReservasDao extends JpaRepository<Reserva,Integer> {
}
