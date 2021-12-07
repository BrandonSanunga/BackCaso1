package com.grupo3.Caso1.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Vehiculo {
	@Id
	private String chasis_vehiculo;
	private String color;
	private String ramv;
	private String placa;
	private boolean estado;
	@OneToOne
	private Pais id_pais;
	@ManyToOne
	private GarantiaVehiculo id_garantia;
	@ManyToOne
	private vehiculo_catalogo vehiculoCatalogo;
	
	
	
	public Vehiculo() {
		
		// TODO Auto-generated constructor stub
	}
	public Vehiculo(String chasis_vehiculo, String color, String ramv, String placa, boolean estado, Pais id_pais,
			GarantiaVehiculo id_garantia, vehiculo_catalogo vehiculoCatalogo) {
		this.chasis_vehiculo = chasis_vehiculo;
		this.color = color;
		this.ramv = ramv;
		this.placa = placa;
		this.estado = estado;
		this.id_pais = id_pais;
		this.id_garantia = id_garantia;
		this.vehiculoCatalogo = vehiculoCatalogo;
	}
	public String getChasis_vehiculo() {
		return chasis_vehiculo;
	}
	public void setChasis_vehiculo(String chasis_vehiculo) {
		this.chasis_vehiculo = chasis_vehiculo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRamv() {
		return ramv;
	}
	public void setRamv(String ramv) {
		this.ramv = ramv;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Pais getId_pais() {
		return id_pais;
	}
	public void setId_pais(Pais id_pais) {
		this.id_pais = id_pais;
	}
	public GarantiaVehiculo getId_garantia() {
		return id_garantia;
	}
	public void setId_garantia(GarantiaVehiculo id_garantia) {
		this.id_garantia = id_garantia;
	}
	public vehiculo_catalogo getVehiculoCatalogo() {
		return vehiculoCatalogo;
	}
	public void setVehiculoCatalogo(vehiculo_catalogo vehiculoCatalogo) {
		this.vehiculoCatalogo = vehiculoCatalogo;
	}
	
	

}
