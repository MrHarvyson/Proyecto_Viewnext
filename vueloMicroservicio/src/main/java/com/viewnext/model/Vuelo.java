package com.viewnext.model;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * @author Jose Moreno
 */
@Entity
@Table(name="vuelos")
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idvuelo;
    private String compania;
    private LocalDate fechavuelo;
    private double precio;
    private int plazasdisponibles;

    public Vuelo() {
    }

    public Vuelo(int idvuelo, String compania, LocalDate fechavuelo, double precio, int plazasdisponibles) {
        this.idvuelo = idvuelo;
        this.compania = compania;
        this.fechavuelo = fechavuelo;
        this.precio = precio;
        this.plazasdisponibles = plazasdisponibles;
    }

    public int getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(int idvuelo) {
        this.idvuelo = idvuelo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public LocalDate getFechavuelo() {
        return fechavuelo;
    }

    public void setFechavuelo(LocalDate fechavuelo) {
        this.fechavuelo = fechavuelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPlazasdisponibles() {
        return plazasdisponibles;
    }

    public void setPlazasdisponibles(int plazasdisponibles) {
        this.plazasdisponibles = plazasdisponibles;
    }
}
