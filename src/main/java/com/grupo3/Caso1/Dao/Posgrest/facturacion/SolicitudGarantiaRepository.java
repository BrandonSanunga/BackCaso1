package com.grupo3.Caso1.Dao.Posgrest.facturacion;

import java.util.List;

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
	
	//@Query("select f from Factura f join fetch f.cliente c where c.cedulaClient=?1")
	
	/*@Query("SELECT v.chasis_vehiculo, v.color, c.emailClient, a.links_imagen,a.year_vehiculo, "
			+ "l.marca,l.modelo FROM Vehiculo v, DetalleFactura d, Factura f, Client c, vehiculo_catalogo a, "
			+ "Disenovehiculo l where c.cedulaClient=:id and c.cedulaClient=f.cliente.cedulaClient "
			+ "and v.chasis_vehiculo=d.vehiculo.chasis_vehiculo "
			+ "and v.vehiculoCatalogo=a.id_vehiculo_catalogo and a.diseno=l.id_diseno")*/
	@Query(value="SELECT v.chasis_vehiculo, v.color, f.cliente_cedula_client, c.email_client, a.links_imagen,a.year_vehiculo,l.marca,l.modelo\r\n"
			+ "FROM vehiculo v, detallefactura d, factura f, client c, vehiculo_catalogo a, disenovehiculo l\r\n"
			+ "where c.cedula_client=:id and c.cedula_client=f.cliente_cedula_client and f.\"id\"=d.factura_id "
			+ "and v.chasis_vehiculo=d.vehiculo_chasis_vehiculo "
			+ "and v.vehiculo_catalogo_id_vehiculo_catalogo=a.id_vehiculo_catalogo and a.id_diseno=l.id_diseno", nativeQuery=true)
	public List<Object> listCarsByCedula(@Param("id") String id);
}
