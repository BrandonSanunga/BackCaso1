package com.grupo3.Caso1.Dao.Postgres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo3.Caso1.Model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {
	

}
