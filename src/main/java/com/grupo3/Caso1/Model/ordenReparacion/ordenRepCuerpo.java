package com.grupo3.Caso1.Model.ordenReparacion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ordenRepCuerpo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idordenCuerpo;
    @ManyToOne
    private ordenRepCavecera ordenRepCavecera;
    private String trabajoSolicitado;
    private String trabajoRealizar;
    private String placa;
    private String color;
    private boolean llaves;
    private String codigoVehiculo;
    private String tipoCombustible;
    private String Observaciones;
    private String imagenes;

    public ordenRepCuerpo() {
    }

    public ordenRepCuerpo(Long idordenCuerpo, com.grupo3.Caso1.Model.ordenReparacion.ordenRepCavecera ordenRepCavecera,
            String trabajoSolicitado, String trabajoRealizar, String placa, String color, boolean llaves,
            String codigoVehiculo, String tipoCombustible, String observaciones, String imagenes) {
        this.idordenCuerpo = idordenCuerpo;
        this.ordenRepCavecera = ordenRepCavecera;
        this.trabajoSolicitado = trabajoSolicitado;
        this.trabajoRealizar = trabajoRealizar;
        this.placa = placa;
        this.color = color;
        this.llaves = llaves;
        this.codigoVehiculo = codigoVehiculo;
        this.tipoCombustible = tipoCombustible;
        Observaciones = observaciones;
        this.imagenes = imagenes;
    }

    public Long getIdordenCuerpo() {
        return idordenCuerpo;
    }

    public void setIdordenCuerpo(Long idordenCuerpo) {
        this.idordenCuerpo = idordenCuerpo;
    }

    public ordenRepCavecera getOrdenRepCavecera() {
        return ordenRepCavecera;
    }

    public void setOrdenRepCavecera(ordenRepCavecera ordenRepCavecera) {
        this.ordenRepCavecera = ordenRepCavecera;
    }

    public String getTrabajoSolicitado() {
        return trabajoSolicitado;
    }

    public void setTrabajoSolicitado(String trabajoSolicitado) {
        this.trabajoSolicitado = trabajoSolicitado;
    }

    public String getTrabajoRealizar() {
        return trabajoRealizar;
    }

    public void setTrabajoRealizar(String trabajoRealizar) {
        this.trabajoRealizar = trabajoRealizar;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLlaves() {
        return llaves;
    }

    public void setLlaves(boolean llaves) {
        this.llaves = llaves;
    }

    public String getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(String codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

}
