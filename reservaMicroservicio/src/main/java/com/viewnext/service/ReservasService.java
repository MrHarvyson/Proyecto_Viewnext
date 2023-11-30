package com.viewnext.service;

import com.viewnext.model.Res;
import com.viewnext.model.Reserva;
import java.util.List;

/**
 * @author Jose Moreno
 */
public interface ReservasService {

    /**
     * nos creara una reserva
     * @param reserva -> pasamos un objeto de tipo reserva
     */
    void altaReserva(Reserva reserva);

    /**
     *
     * @return nos devuelve una lista de reservas
     */
    List<Reserva> reservas();

    /**
     *
     * @param nombre -> nombre del hotel
     * @return nos devuelve una lista de reservas por nombre de hotel
     */
    List<Res> reservasPorHotel(String nombre);

}
