package com.grupo3.Caso1.Service.Posgrest.ServiceImp.facturacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Posgrest.facturacion.SolicitudGarantiaRepository;
import com.grupo3.Caso1.Mappers.TallerMapper;
import com.grupo3.Caso1.Model.MisVehiculos;
import com.grupo3.Caso1.Model.SolicitudGarantia;
import com.grupo3.Caso1.Service.Posgrest.SolicitudGarantiaService;

@Service
public class SolicitudGarantiaServImpl extends GenericServiceImp<SolicitudGarantia, Long>
		implements SolicitudGarantiaService {
	@Autowired
	private SolicitudGarantiaRepository garantiaRepository;

	@Override
	public CrudRepository<SolicitudGarantia, Long> getDao() {
		// TODO Auto-generated method stub
		return garantiaRepository;
	}

	public List<SolicitudGarantia> findAllByEstado(Boolean estado) {
		List<SolicitudGarantia> solGaranrespuesta = new ArrayList<>();
		List<SolicitudGarantia> solicitudes = garantiaRepository.findAll();
		for (int i = 0; i < solicitudes.size(); i++) {
			if (solicitudes.get(i).isEstado_solicitud() == estado) {
				solGaranrespuesta.add(solicitudes.get(i));
			}
		}
		return solGaranrespuesta;
	}

	public void cambiarEstadoSolicitud(Long id) {
		garantiaRepository.cambiarEstadoReclamo(id);
	}

	public List<MisVehiculos> listCarsByCedula(String id) {
	
		List<String> r = garantiaRepository.listCarsByCedula(id);
		List<MisVehiculos> vehiculos = new ArrayList<MisVehiculos>();
		
		for (int i = 0; i < r.size(); i++) {
			MisVehiculos vehiculosFor = new MisVehiculos();
			vehiculosFor.setChasis_vehiculo(r.get(i));
			vehiculosFor.setLinks_imagen(r.get(i));
			vehiculosFor.setMarca(r.get(i));
			vehiculosFor.setModelo(r.get(i));
			
			System.err.println("El chasis es: "+vehiculosFor.getChasis_vehiculo());
			
			vehiculos.add(vehiculosFor);
		} 
		System.out.println("EL objeto es: "+r);
		return vehiculos;
	}

}
