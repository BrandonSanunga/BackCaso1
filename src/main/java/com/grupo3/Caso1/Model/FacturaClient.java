package com.grupo3.Caso1.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="factura")
public class FacturaClient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_factura;
	@Temporal(TemporalType.DATE)
	private Date fecha_emision;
	private String fk_cedula_cliente;
	private double total_factura;
	
	public FacturaClient() {
	}

	public FacturaClient(String fk_cedula_cliente) {
		super();
		this.fk_cedula_cliente = fk_cedula_cliente;
	}

	@PrePersist
	public void prePersist() {
		fecha_emision = new Date();
	}

	public long getId_factura() {
		return id_factura;
	}

	public Date getFecha_emision() {
		return fecha_emision;
	}

	public String getFk_cedula_cliente() {
		return fk_cedula_cliente;
	}

	public void setFk_cedula_cliente(String fk_cedula_cliente) {
		this.fk_cedula_cliente = fk_cedula_cliente;
	}

	public double getTotal_factura() {
		return total_factura;
	}

}

