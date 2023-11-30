package com.viewnext.controller;

import com.viewnext.model.Vuelo;
import com.viewnext.service.VuelosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Jose Moreno
 */
@CrossOrigin("*")
@RestController
public class VuelosController {

    @Autowired
    VuelosService service;

    /**
     *
     * @param plazas -> numeros de plazas que queremos preguntar
     * @return nos devuelve una lista de vuelos dependiendo de las plazas solicitadas
     * hacemos uso del servicio {@link VuelosService#vuelosPorPlaza(int)}
     * http://localhost:9000/vuelos/{plazas}
     */
    @GetMapping(value = "vuelos/{plazas}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Vuelo> vuelosPorPlaza(@PathVariable("plazas") int plazas){
        return service.vuelosPorPlaza(plazas);
    }

    /**
     *
     * @return nos devuelve una lista de todos los vuelos
     * hacemos uso del servicio {@link VuelosService#vuelos()}
     * http://localhost:9000/vuelos
     */
    @GetMapping(value = "vuelos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Vuelo> vuelos(){
        return service.vuelos();
    }

    /**
     *
     * @param idvuelo -> indicamos id del vuelo del que queremos actualizar
     * @param plazasreservadas -> cantidad de plazas que queremos reservar
     * hacemos una actualizacion de la cantidad de plazas que tiene un vuelo
     * hacemos uso del servicio {@link VuelosService#actualizaVuelo(int, int)}
     * http://localhost:9000/vuelos/{idvuelo}/{plazasreservadas}
     *
     */
    @PutMapping(value = "vuelos/{idvuelo}/{plazasreservadas}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarVuelo(@PathVariable("idvuelo") int idvuelo,@PathVariable("plazasreservadas") int plazasreservadas){
        service.actualizaVuelo(idvuelo,plazasreservadas);
    }

}
