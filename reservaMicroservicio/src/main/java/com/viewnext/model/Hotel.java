package com.viewnext.model;

/**
 * @author Jose Moreno
 * Clase auxiliar par obtener los datos del microservicio de hotel
 */
public class Hotel {

    private int idhotel;
    private String nombre;
    private String Categoria;
    private Double precio;
    private boolean disponible;
    private String url;
    private String descripcion;


    public Hotel() {
    }

    public Hotel(int idhotel, String nombre, String categoria, Double precio, boolean disponible, String url, String descripcion) {
        this.idhotel = idhotel;
        this.nombre = nombre;
        Categoria = categoria;
        this.precio = precio;
        this.disponible = disponible;
        this.url = url;
        this.descripcion = descripcion;
    }

    public int getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(int idhotel) {
        this.idhotel = idhotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

