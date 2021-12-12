package com.grupo3.Caso1.Dao.Posgrest.facturacion;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.grupo3.Caso1.Model.SolicitudGarantia;

public interface SolicitudGarantiaRepository extends JpaRepository<SolicitudGarantia, Long> {

	@Transactional
	@Modifying
	@Query("UPDATE SolicitudGarantia set estado_solicitud=false WHERE id_solicitud=:id")
	public void cambiarEstadoReclamo(@Param("id") Long id);
}
