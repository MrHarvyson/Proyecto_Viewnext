package com.viewnext.model;

import jakarta.persistence.*;

/**
 * @author Jose Moreno
 */
@Entity
@Table(name="reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idreserva;
    private String nombrecliente;
    private String dni;
    private int idhotel;
    private int idvuelo;
    private int totalreservas;

    public Reserva() {
    }

    public Reserva(int idreserva, String nombrecliente, String dni, int idhotel, int idvuelo, int totalreservas) {
        this.idreserva = idreserva;
        this.nombrecliente = nombrecliente;
        this.dni = dni;
        this.idhotel = idhotel;
        this.idvuelo = idvuelo;
        this.totalreservas = totalreservas;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(int idhotel) {
        this.idhotel = idhotel;
    }

    public int getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(int idvuelo) {
        this.idvuelo = idvuelo;
    }

    public int getTotalreservas() {
        return totalreservas;
    }

    public void setTotalreservas(int totalreservas) {
        this.totalreservas = totalreservas;
    }
}
