package com.grupo3.Caso1.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FacturaRepuestos {
	
	@Id
	private String id_factura_repuesto;
	
	private Date fecha;

	private String nombre_repuesto;
	private String precio_venta;
	private String iva;
	private String descuento;
	private String cantidad;
	private String subtotal;
	private String total;
	public String getId_factura_repuesto() {
		return id_factura_repuesto;
	}
	public void setId_factura_repuesto(String id_factura_repuesto) {
		this.id_factura_repuesto = id_factura_repuesto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNombre_repuesto() {
		return nombre_repuesto;
	}
	public void setNombre_repuesto(String nombre_repuesto) {
		this.nombre_repuesto = nombre_repuesto;
	}
	public String getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(String precio_venta) {
		this.precio_venta = precio_venta;
	}
	public String getIva() {
		return iva;
	}
	public void setIva(String iva) {
		this.iva = iva;
	}
	public String getDescuento() {
		return descuento;
	}
	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	
}
