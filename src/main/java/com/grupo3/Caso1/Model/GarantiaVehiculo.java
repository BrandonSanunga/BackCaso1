package com.grupo3.Caso1.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GarantiaVehiculo {
	@Id
	private Integer id_garantia;
	private String descripcion;
	
	
	
	public GarantiaVehiculo() {
		// TODO Auto-generated constructor stub
	}
	public GarantiaVehiculo(Integer id_garantia, String descripcion) {
		this.id_garantia = id_garantia;
		this.descripcion = descripcion;
	}
	public int getId_garantia() {
		return id_garantia;
	}
	public void setId_garantia(int id_garantia) {
		this.id_garantia = id_garantia;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
