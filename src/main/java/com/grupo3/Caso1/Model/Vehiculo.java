package com.grupo3.Caso1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private static final long serialVersionUID = 982015014319402841L;
	private String marca;
	private String modelo;
	private String color;
	private String año_fabricacion;
	private String numero_chasis;
	private String placa;
	private String cilindraje;
	private String numero_motor;
	private String ramv;
	private Double precio_compra;
	private Double precio_venta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAño_fabricacion() {
		return año_fabricacion;
	}

	public void setAño_fabricacion(String año_fabricacion) {
		this.año_fabricacion = año_fabricacion;
	}

	public String getNumero_chasis() {
		return numero_chasis;
	}

	public void setNumero_chasis(String numero_chasis) {
		this.numero_chasis = numero_chasis;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getNumero_motor() {
		return numero_motor;
	}

	public void setNumero_motor(String numero_motor) {
		this.numero_motor = numero_motor;
	}

	public String getRamv() {
		return ramv;
	}

	public void setRamv(String ramv) {
		this.ramv = ramv;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Double getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(Double precio_compra) {
		this.precio_compra = precio_compra;
	}

	public Double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(Double precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	

}
