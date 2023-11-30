package com.viewnext.service;

import com.viewnext.model.Hotel;
import java.util.List;

/**
 * @author Jose Moreno
 */
public interface HotelesService {

    List<Hotel> hoteles();

    List<Hotel> hotelesDisponibles();

    Hotel getHotel(String nombre);

}
