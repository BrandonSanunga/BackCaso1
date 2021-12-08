package com.grupo3.Caso1.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cotizacion")
public class Cotizacion implements Serializable{
	  private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	    @ManyToOne(fetch = FetchType.LAZY)
	    private Cliente cliente;
	    
	    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	    @ManyToOne(fetch = FetchType.LAZY)
	    private vehiculo_catalogo vehiculo_catalogo;
	  
	    
	    @Column(nullable = false)
	    private Double total;


		public Cotizacion() {
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public Double getTotal() {
			return total;
		}

		public void setTotal(Double total) {
			this.total = total;
		}

		public vehiculo_catalogo getVehiculo_catalogo() {
			return vehiculo_catalogo;
		}

		public void setVehiculo_catalogo(vehiculo_catalogo vehiculo_catalogo) {
			this.vehiculo_catalogo = vehiculo_catalogo;
		}
		

}
