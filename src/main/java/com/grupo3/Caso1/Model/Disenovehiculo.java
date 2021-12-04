package com.grupo3.Caso1.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disenovehiculo {
	
	@Id
	private String id_diseno;
	private String marca;
	private String modelo;
	
	public Disenovehiculo(String id_diseno, String marca, String modelo) {
		
		this.id_diseno = id_diseno;
		this.marca = marca;
		this.modelo = modelo;
	}
	public Disenovehiculo() {
		
	}
	public String getId_diseno() {
		return id_diseno;
	}
	public void setId_diseno(String id_diseno) {
		this.id_diseno = id_diseno;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
