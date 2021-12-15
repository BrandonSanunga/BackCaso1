package com.grupo3.Caso1.Dao.Posgrest;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.grupo3.Caso1.Model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, String> {
	@Transactional
	@Modifying
	@Query("UPDATE Vehiculo set estado=false WHERE chasis=:id")
	public void cambiarEstadoVehiculo(@Param("id") String id);

}
