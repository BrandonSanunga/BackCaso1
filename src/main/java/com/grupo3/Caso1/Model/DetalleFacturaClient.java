package com.grupo3.Caso1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detallefactura")
public class DetalleFacturaClient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_detalle;
	private int cantidad;
	private double precio_unt;
	private double precio_total;
	@ManyToOne
	@JoinColumn(name = "id_factura")
	private FacturaClient fk_id_factura;
	@ManyToOne
	@JoinColumn(name = "chasis_vehiculo")
	private Vehiculo fk_chasis_vehiculo;
	
	
	
	public DetalleFacturaClient() {
	}

	public DetalleFacturaClient(int cantidad, double precio_unt, double precio_total,
			FacturaClient fk_id_factura, Vehiculo fk_chasis_vehiculo) {
		super();
		this.cantidad = cantidad;
		this.precio_unt = precio_unt;
		this.precio_total = precio_total;
		this.fk_id_factura = fk_id_factura;
		this.fk_chasis_vehiculo = fk_chasis_vehiculo;
	}

	public Long getId_detalle() {
		return id_detalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio_unt() {
		return precio_unt;
	}

	public void setPrecio_unt(double precio_unt) {
		this.precio_unt = precio_unt;
	}

	public double getPrecio_total() {
		return precio_total;
	}

	public void setPrecio_total(double precio_total) {
		this.precio_total = precio_total;
	}

	public FacturaClient getFk_id_factura() {
		return fk_id_factura;
	}

	public void setFk_id_factura(FacturaClient fk_id_factura) {
		this.fk_id_factura = fk_id_factura;
	}

	public Vehiculo getFk_chasis_vehiculo() {
		return fk_chasis_vehiculo;
	}

	public void setFk_chasis_vehiculo(Vehiculo fk_chasis_vehiculo) {
		this.fk_chasis_vehiculo = fk_chasis_vehiculo;
	}
}