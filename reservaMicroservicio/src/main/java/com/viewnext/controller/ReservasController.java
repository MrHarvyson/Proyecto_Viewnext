package com.viewnext.controller;

import com.viewnext.model.Res;
import com.viewnext.model.Reserva;
import com.viewnext.service.ReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author Jose Moreno
 */
@CrossOrigin("*")
@RestController
public class ReservasController {

    @Autowired
    ReservasService service;

    /**
     *
     * @param reserva -> pasamos un obejto de tipo reserva para crear una
     * hacemos uso del servicio {@link ReservasService#altaReserva(Reserva)}
     * http://localhost:8080/reservas
     */
    @PostMapping(value = "reservas", produces = MediaType.APPLICATION_JSON_VALUE)
    public void crearReserva(@RequestBody Reserva reserva){
        service.altaReserva(reserva);
    }

    /**
     *
     * @param nombre --> nombre del hotel que queremos ver sus reservas
     * @return devuelve una lista con todas las reservas del hotel = :nombre
     * hacemos uso del servicio {@link ReservasService#reservasPorHotel(String)}
     * http://localhost:8080/reservas/{nombre}
     */
    @GetMapping(value = "reservas/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Res> reservasPorHotel(@PathVariable("nombre") String nombre){
        return service.reservasPorHotel(nombre);
    }

    /**
     *
     * @return nos devuelve una lista con todas las reservas
     * hacemos uso del servicio {@link ReservasService#reservas()}
     * http://localhost:8080/reservas
     */
    @GetMapping(value = "reservas", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Reserva> reservas(){
        return service.reservas();
    }


}
