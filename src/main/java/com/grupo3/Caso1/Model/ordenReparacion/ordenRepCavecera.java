package com.grupo3.Caso1.Model.ordenReparacion;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.grupo3.Caso1.Model.Vehiculo;

@Entity
public class ordenRepCavecera {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idordenCave;
    public Date fechaActual;
    public String idcedulaClient;
    public Date fechaIngreso;
    public String horaIngreso;
    @ManyToOne
    private Vehiculo vehiculo;

    public ordenRepCavecera() {
    }

    public ordenRepCavecera(Long idordenCave, Date fechaActual, String idcedulaClient, Date fechaIngreso,
            String horaIngreso, Vehiculo vehiculo) {
        this.idordenCave = idordenCave;
        this.fechaActual = fechaActual;
        this.idcedulaClient = idcedulaClient;
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
        this.vehiculo = vehiculo;
    }

    public Long getIdordenCave() {
        return idordenCave;
    }

    public void setIdordenCave(Long idordenCave) {
        this.idordenCave = idordenCave;
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public String getIdcedulaClient() {
        return idcedulaClient;
    }

    public void setIdcedulaClient(String idcedulaClient) {
        this.idcedulaClient = idcedulaClient;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
