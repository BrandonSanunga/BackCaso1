package com.grupo3.Caso1.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Repuestos {

	@Id
	private String id_repuesto;
	
	private String nombre_repuesto;
	private String descripcion_repuesto;
	private int año_repuesto;
	private String pais_repuesto;
	private String nombre_fabricante;
	private String modelo;
	private int numero_serie;
	private int cantidad;
	private float precio_costo;
	private float iva;
	private float precio_venta;
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
	public String getDescripcion_repuesto() {
		return descripcion_repuesto;
	}
	public void setDescripcion_repuesto(String descripcion_repuesto) {
		this.descripcion_repuesto = descripcion_repuesto;
	}
	public int getAño_repuesto() {
		return año_repuesto;
	}
	public void setAño_repuesto(int año_repuesto) {
		this.año_repuesto = año_repuesto;
	}
	public String getPais_repuesto() {
		return pais_repuesto;
	}
	public void setPais_repuesto(String pais_repuesto) {
		this.pais_repuesto = pais_repuesto;
	}
	public String getNombre_fabricante() {
		return nombre_fabricante;
	}
	public void setNombre_fabricante(String nombre_fabricante) {
		this.nombre_fabricante = nombre_fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumero_serie() {
		return numero_serie;
	}
	public void setNumero_serie(int numero_serie) {
		this.numero_serie = numero_serie;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecio_costo() {
		return precio_costo;
	}
	public void setPrecio_costo(float precio_costo) {
		this.precio_costo = precio_costo;
	}
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public float getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(float precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	
}
