package com.grupo3.Caso1.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Repuestos {

	@Id
	private String id_repuesto;
	
	private String nombre_repuesto;
	
	@ManyToOne
	@JoinColumn(name="id_diseno")	
	private Disenovehiculo id_diseno;
	
	private float precio;
	
	public Repuestos(String id_repuesto, String nombre_repuesto, float precio) {
		this.id_repuesto = id_repuesto;
		this.nombre_repuesto = nombre_repuesto;
		this.precio = precio;
	}


	public Repuestos() {
		
	}

	public String getId_repuesto() {
		return id_repuesto;
	}
	public void setId_repuesto(String id_repuesto) {
		this.id_repuesto = id_repuesto;
	}
	public String getNombre_repuesto() {
		return nombre_repuesto;
	}
	public void setNombre_repuesto(String nombre_repuesto) {
		this.nombre_repuesto = nombre_repuesto;
	}

	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	}
