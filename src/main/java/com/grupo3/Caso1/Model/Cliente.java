package com.grupo3.Caso1.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String cedula_cliente;

	private String nombre_cliente;

	private String apellido_cliente;

	private Date birthday_cliente;

	private String email_cliente;

	private String celular_cliente;

	private String direccion_cliente;

	private String password_cliente;

	@JsonIgnoreProperties(value = { "cliente", "hibernateLazyInitializer", "handler" }, allowSetters = true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Factura> facturas;

	public Cliente() {
		this.facturas=new ArrayList<>();
	}

	public Cliente(Long id, String cedula_cliente, String nombre_cliente, String apellido_cliente,
			Date birthday_cliente, String email_cliente, String celular_cliente, String direccion_cliente,
			String password_cliente) {
		this.id = id;
		this.cedula_cliente = cedula_cliente;
		this.nombre_cliente = nombre_cliente;
		this.apellido_cliente = apellido_cliente;
		this.birthday_cliente = birthday_cliente;
		this.email_cliente = email_cliente;
		this.celular_cliente = celular_cliente;
		this.direccion_cliente = direccion_cliente;
		this.password_cliente = password_cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCedula_cliente() {
		return cedula_cliente;
	}

	public void setCedula_cliente(String cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getApellido_cliente() {
		return apellido_cliente;
	}

	public void setApellido_cliente(String apellido_cliente) {
		this.apellido_cliente = apellido_cliente;
	}

	public Date getBirthday_cliente() {
		return birthday_cliente;
	}

	public void setBirthday_cliente(Date birthday_cliente) {
		this.birthday_cliente = birthday_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	public String getCelular_cliente() {
		return celular_cliente;
	}

	public void setCelular_cliente(String celular_cliente) {
		this.celular_cliente = celular_cliente;
	}

	public String getDireccion_cliente() {
		return direccion_cliente;
	}

	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
	}

	public String getPassword_cliente() {
		return password_cliente;
	}

	public void setPassword_cliente(String password_cliente) {
		this.password_cliente = password_cliente;
	}

}
