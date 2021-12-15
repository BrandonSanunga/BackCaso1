package com.grupo3.Caso1.Service.Posgrest.ServiceImp;

<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 4b32ad7da49df23077ed0711f44cdee67a7bd300
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Posgrest.VehiculoRepository;
import com.grupo3.Caso1.Model.SolicitudGarantia;
import com.grupo3.Caso1.Model.Vehiculo;
import com.grupo3.Caso1.Service.Posgrest.VehiculoService;

@Service
public class VehiculoServiceImp extends GenericServiceImp<Vehiculo, String> implements VehiculoService {

	@Autowired
	private VehiculoRepository vehiculo;

	@Override
	public CrudRepository<Vehiculo, String> getDao() {
		// TODO Auto-generated method stub
		return vehiculo;
	}

<<<<<<< HEAD
	public List<Vehiculo> findAllByEstado(Boolean estado){
		List<Vehiculo> solGaranrespuesta= new ArrayList<>();
		List<Vehiculo> solicitudes = vehiculo.findAll(); 
		for (int i=0; i<solicitudes.size();i++) {
			if(solicitudes.get(i).isEstado()==estado) {
				solGaranrespuesta.add(solicitudes.get(i));
			}
	   }
		return solGaranrespuesta;
   }

	public void cambiarEstadoSolicitud(String id) {
		vehiculo.cambiarEstadoVehiculo(id);
	
}
=======
	@Override
	public List<Vehiculo> findAllEstadoFalse() {
		return vehiculo.findAllEstadoFalse();
	}

>>>>>>> 4b32ad7da49df23077ed0711f44cdee67a7bd300
}
