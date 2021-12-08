package com.grupo3.Caso1.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class InformeReclamo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idinformeRecha;
    private Date fechaEmicion;
    private String idCliente;
    @ManyToOne
    private Vehiculo vehiculo;
    private String descripcionInforme;
    private boolean tipo_informe;
    private boolean respuesta_cliente;

    public InformeReclamo() {
    }

    public InformeReclamo(Long idinformeRecha, Date fechaEmicion, String idCliente, Vehiculo vehiculo,
            String descripcionInforme, boolean tipo_informe, boolean respuesta_cliente) {
        this.idinformeRecha = idinformeRecha;
        this.fechaEmicion = fechaEmicion;
        this.idCliente = idCliente;
        this.vehiculo = vehiculo;
        this.descripcionInforme = descripcionInforme;
        this.tipo_informe = tipo_informe;
        this.respuesta_cliente = respuesta_cliente;
    }

    public Long getIdinformeRecha() {
        return idinformeRecha;
    }

    public void setIdinformeRecha(Long idinformeRecha) {
        this.idinformeRecha = idinformeRecha;
    }

    public Date getFechaEmicion() {
        return fechaEmicion;
    }

    public void setFechaEmicion(Date fechaEmicion) {
        this.fechaEmicion = fechaEmicion;
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

    public String getDescripcionInforme() {
        return descripcionInforme;
    }

    public void setDescripcionInforme(String descripcionInforme) {
        this.descripcionInforme = descripcionInforme;
    }

    public boolean isTipo_informe() {
        return tipo_informe;
    }

    public void setTipo_informe(boolean tipo_informe) {
        this.tipo_informe = tipo_informe;
    }

    public boolean isRespuesta_cliente() {
        return respuesta_cliente;
    }

    public void setRespuesta_cliente(boolean respuesta_cliente) {
        this.respuesta_cliente = respuesta_cliente;
    }

}
