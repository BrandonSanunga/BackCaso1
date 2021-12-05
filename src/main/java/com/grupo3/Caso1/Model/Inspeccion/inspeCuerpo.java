package com.grupo3.Caso1.Model.Inspeccion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class inspeCuerpo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idinspeCuerpo;
    @ManyToOne
    private inspeCavecera inspeCavecera;
    private String luces;
    private String parabrisas;
    private String limpiaparabrisas;
    private String bocina;
    private String bateria;
    private String aceite;
    private String liquido_transmicion;
    private String liquido_direccion;
    private String liquido_frenos;
    private String refrigerante;
    private String filtro_cabina;
    private String filtro_aire;
    private String cinturones;
    private String linea_frenos;
    private String clabes_frenos;
    private String suspencion;
    private String direccion;
    private String eje;
    private String liquido_diferencia_tracero;
    private String escape;
    private String amortiguador;
    private String puntuales;
    private String patron_desgaste_neomatico;
    private String tipo_reparacion_neomatico;
    private String pastillas_frenos;
    private String observaciones;

    public inspeCuerpo() {
    }

    public inspeCuerpo(Long idinspeCuerpo, com.grupo3.Caso1.Model.Inspeccion.inspeCavecera inspeCavecera, String luces,
            String parabrisas, String limpiaparabrisas, String bocina, String bateria, String aceite,
            String liquido_transmicion, String liquido_direccion, String liquido_frenos, String refrigerante,
            String filtro_cabina, String filtro_aire, String cinturones, String linea_frenos, String clabes_frenos,
            String suspencion, String direccion, String eje, String liquido_diferencia_tracero, String escape,
            String amortiguador, String puntuales, String patron_desgaste_neomatico, String tipo_reparacion_neomatico,
            String pastillas_frenos, String observaciones) {
        this.idinspeCuerpo = idinspeCuerpo;
        this.inspeCavecera = inspeCavecera;
        this.luces = luces;
        this.parabrisas = parabrisas;
        this.limpiaparabrisas = limpiaparabrisas;
        this.bocina = bocina;
        this.bateria = bateria;
        this.aceite = aceite;
        this.liquido_transmicion = liquido_transmicion;
        this.liquido_direccion = liquido_direccion;
        this.liquido_frenos = liquido_frenos;
        this.refrigerante = refrigerante;
        this.filtro_cabina = filtro_cabina;
        this.filtro_aire = filtro_aire;
        this.cinturones = cinturones;
        this.linea_frenos = linea_frenos;
        this.clabes_frenos = clabes_frenos;
        this.suspencion = suspencion;
        this.direccion = direccion;
        this.eje = eje;
        this.liquido_diferencia_tracero = liquido_diferencia_tracero;
        this.escape = escape;
        this.amortiguador = amortiguador;
        this.puntuales = puntuales;
        this.patron_desgaste_neomatico = patron_desgaste_neomatico;
        this.tipo_reparacion_neomatico = tipo_reparacion_neomatico;
        this.pastillas_frenos = pastillas_frenos;
        this.observaciones = observaciones;
    }

    public inspeCavecera getInspeCavecera() {
        return inspeCavecera;
    }

    public void setInspeCavecera(inspeCavecera inspeCavecera) {
        this.inspeCavecera = inspeCavecera;
    }

    public Long getIdinspeCuerpo() {
        return idinspeCuerpo;
    }

    public void setIdinspeCuerpo(Long idinspeCuerpo) {
        this.idinspeCuerpo = idinspeCuerpo;
    }

    public String getLuces() {
        return luces;
    }

    public void setLuces(String luces) {
        this.luces = luces;
    }

    public String getParabrisas() {
        return parabrisas;
    }

    public void setParabrisas(String parabrisas) {
        this.parabrisas = parabrisas;
    }

    public String getLimpiaparabrisas() {
        return limpiaparabrisas;
    }

    public void setLimpiaparabrisas(String limpiaparabrisas) {
        this.limpiaparabrisas = limpiaparabrisas;
    }

    public String getBocina() {
        return bocina;
    }

    public void setBocina(String bocina) {
        this.bocina = bocina;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

    public String getLiquido_transmicion() {
        return liquido_transmicion;
    }

    public void setLiquido_transmicion(String liquido_transmicion) {
        this.liquido_transmicion = liquido_transmicion;
    }

    public String getLiquido_direccion() {
        return liquido_direccion;
    }

    public void setLiquido_direccion(String liquido_direccion) {
        this.liquido_direccion = liquido_direccion;
    }

    public String getLiquido_frenos() {
        return liquido_frenos;
    }

    public void setLiquido_frenos(String liquido_frenos) {
        this.liquido_frenos = liquido_frenos;
    }

    public String getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
    }

    public String getFiltro_cabina() {
        return filtro_cabina;
    }

    public void setFiltro_cabina(String filtro_cabina) {
        this.filtro_cabina = filtro_cabina;
    }

    public String getFiltro_aire() {
        return filtro_aire;
    }

    public void setFiltro_aire(String filtro_aire) {
        this.filtro_aire = filtro_aire;
    }

    public String getCinturones() {
        return cinturones;
    }

    public void setCinturones(String cinturones) {
        this.cinturones = cinturones;
    }

    public String getLinea_frenos() {
        return linea_frenos;
    }

    public void setLinea_frenos(String linea_frenos) {
        this.linea_frenos = linea_frenos;
    }

    public String getClabes_frenos() {
        return clabes_frenos;
    }

    public void setClabes_frenos(String clabes_frenos) {
        this.clabes_frenos = clabes_frenos;
    }

    public String getSuspencion() {
        return suspencion;
    }

    public void setSuspencion(String suspencion) {
        this.suspencion = suspencion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEje() {
        return eje;
    }

    public void setEje(String eje) {
        this.eje = eje;
    }

    public String getLiquido_diferencia_tracero() {
        return liquido_diferencia_tracero;
    }

    public void setLiquido_diferencia_tracero(String liquido_diferencia_tracero) {
        this.liquido_diferencia_tracero = liquido_diferencia_tracero;
    }

    public String getEscape() {
        return escape;
    }

    public void setEscape(String escape) {
        this.escape = escape;
    }

    public String getAmortiguador() {
        return amortiguador;
    }

    public void setAmortiguador(String amortiguador) {
        this.amortiguador = amortiguador;
    }

    public String getPuntuales() {
        return puntuales;
    }

    public void setPuntuales(String puntuales) {
        this.puntuales = puntuales;
    }

    public String getPatron_desgaste_neomatico() {
        return patron_desgaste_neomatico;
    }

    public void setPatron_desgaste_neomatico(String patron_desgaste_neomatico) {
        this.patron_desgaste_neomatico = patron_desgaste_neomatico;
    }

    public String getTipo_reparacion_neomatico() {
        return tipo_reparacion_neomatico;
    }

    public void setTipo_reparacion_neomatico(String tipo_reparacion_neomatico) {
        this.tipo_reparacion_neomatico = tipo_reparacion_neomatico;
    }

    public String getPastillas_frenos() {
        return pastillas_frenos;
    }

    public void setPastillas_frenos(String pastillas_frenos) {
        this.pastillas_frenos = pastillas_frenos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
