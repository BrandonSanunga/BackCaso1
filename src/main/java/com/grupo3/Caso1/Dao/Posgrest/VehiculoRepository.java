package com.grupo3.Caso1.Dao.Posgrest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.grupo3.Caso1.Model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, String> {
	
	@Query("select v from Vehiculo v where v.estado=false ")
	public List<Vehiculo> findAllEstadoFalse();

}
