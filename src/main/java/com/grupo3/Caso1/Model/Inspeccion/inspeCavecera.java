package com.grupo3.Caso1.Model.Inspeccion;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.grupo3.Caso1.Model.Vehiculo;

@Entity
public class inspeCavecera {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idinspeccionCavecera;
    private Date fecha_insepeccion;
    private String idCliente;
    @ManyToOne
    private Vehiculo vehiculo;

    public inspeCavecera() {
    }

    public inspeCavecera(Long idinspeccionCavecera, Date fecha_insepeccion, String idCliente, Vehiculo vehiculo) {
        this.idinspeccionCavecera = idinspeccionCavecera;
        this.fecha_insepeccion = fecha_insepeccion;
        this.idCliente = idCliente;
        this.vehiculo = vehiculo;
    }

    public Long getIdinspeccionCavecera() {
        return idinspeccionCavecera;
    }

    public void setIdinspeccionCavecera(Long idinspeccionCavecera) {
        this.idinspeccionCavecera = idinspeccionCavecera;
    }

    public Date getFecha_insepeccion() {
        return fecha_insepeccion;
    }

    public void setFecha_insepeccion(Date fecha_insepeccion) {
        this.fecha_insepeccion = fecha_insepeccion;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
