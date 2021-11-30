package com.grupo3.Caso1.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class informeReparacion {
	@Id
	private String id_informe;
	
	private Date fecha_actual;
	private Date fecha_ingreso;
	private String hora_ingreso;
	private String nivel_combustible;
	private String trabajo_solicitado;
	private String trabajo_a_realizar;
	private String observaciones;
	//private String imagen_vehiculo;
	public informeReparacion(String id_informe, Date fecha_actual, Date fecha_ingreso, String hora_ingreso,
			String nivel_combustible, String trabajo_solicitado, String trabajo_a_realizar, String observaciones) {
		
		this.id_informe = id_informe;
		this.fecha_actual = fecha_actual;
		this.fecha_ingreso = fecha_ingreso;
		this.hora_ingreso = hora_ingreso;
		this.nivel_combustible = nivel_combustible;
		this.trabajo_solicitado = trabajo_solicitado;
		this.trabajo_a_realizar = trabajo_a_realizar;
		this.observaciones = observaciones;
	}
	public informeReparacion() {
		
	}
	public String getId_informe() {
		return id_informe;
	}
	public void setId_informe(String id_informe) {
		this.id_informe = id_informe;
	}
	public Date getFecha_actual() {
		return fecha_actual;
	}
	public void setFecha_actual(Date fecha_actual) {
		this.fecha_actual = fecha_actual;
	}
	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}
	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
	public String getHora_ingreso() {
		return hora_ingreso;
	}
	public void setHora_ingreso(String hora_ingreso) {
		this.hora_ingreso = hora_ingreso;
	}
	public String getNivel_combustible() {
		return nivel_combustible;
	}
	public void setNivel_combustible(String nivel_combustible) {
		this.nivel_combustible = nivel_combustible;
	}
	public String getTrabajo_solicitado() {
		return trabajo_solicitado;
	}
	public void setTrabajo_solicitado(String trabajo_solicitado) {
		this.trabajo_solicitado = trabajo_solicitado;
	}
	public String getTrabajo_a_realizar() {
		return trabajo_a_realizar;
	}
	public void setTrabajo_a_realizar(String trabajo_a_realizar) {
		this.trabajo_a_realizar = trabajo_a_realizar;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
}
