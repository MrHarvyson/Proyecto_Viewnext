package com.viewnext.controller;

import com.viewnext.model.Hotel;
import com.viewnext.service.HotelesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author Jose Moreno
 */
@CrossOrigin("*")
@RestController
public class HotelesController {

    @Autowired
    HotelesService service;

    /**
     *
     * @param nombre -> nombre del hotel que queremos obtener de la lista de hoteles
     * @return el hotel que buscamos
     * Hacemos usa del servicio {@link HotelesService#getHotel(String)}
     * http://localhost:8000/hoteles/{nombre}
     */
    @GetMapping(value = "hoteles/{nombre}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Hotel hotel(@PathVariable("nombre") String nombre){
        return service.getHotel(nombre);
    }

    /**
     *
     * @return devuelve una lista de hoteles disponibles
     * haremos uso del servicio {@link HotelesService#hotelesDisponibles()}
     * http://localhost:8000/hoteles/disponibles
     */
    @GetMapping(value = "hoteles/disponibles",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> hotelesDisponibles(){
        return service.hotelesDisponibles();
    }

    /**
     *
     * @return nos devuelve una lista de todos los hoteles
     * horemos usa del servicio {@link HotelesService#hoteles()}
     * http://localhost:8000/hoteles
     */
    @GetMapping(value = "hoteles",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> hoteles(){
        return service.hoteles();
    }

}
