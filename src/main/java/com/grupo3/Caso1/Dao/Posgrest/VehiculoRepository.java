package com.grupo3.Caso1.Dao.Posgrest;

<<<<<<< HEAD
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
=======
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
>>>>>>> 4b32ad7da49df23077ed0711f44cdee67a7bd300

import com.grupo3.Caso1.Model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, String> {
<<<<<<< HEAD
	@Transactional
	@Modifying
	@Query("UPDATE Vehiculo set estado=false WHERE chasis=:id")
	public void cambiarEstadoVehiculo(@Param("id") String id);
=======
	
	@Query("select v from Vehiculo v where v.estado=false ")
	public List<Vehiculo> findAllEstadoFalse();
>>>>>>> 4b32ad7da49df23077ed0711f44cdee67a7bd300

}
