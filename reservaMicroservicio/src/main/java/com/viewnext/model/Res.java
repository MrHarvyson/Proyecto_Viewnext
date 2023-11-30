package com.viewnext.model;

/**
 * @author Jose Moreno
 * clase auxiliar para exportar las reservas con solo nombre, dni e idvuelo
 */
public class Res {

    private String nombre;
    private String dni;
    private int idvuelo;

    public Res() {
    }

    public Res(String nombre, String dni, int idvuelo) {
        this.nombre = nombre;
        this.dni = dni;
        this.idvuelo = idvuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(int idvuelo) {
        this.idvuelo = idvuelo;
    }
}
