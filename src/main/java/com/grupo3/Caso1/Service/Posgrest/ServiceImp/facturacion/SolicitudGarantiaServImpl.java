package com.grupo3.Caso1.Service.Posgrest.ServiceImp.facturacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Posgrest.facturacion.SolicitudGarantiaRepository;
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
		List<MisVehiculos> listaMisVehiculos = new ArrayList<>();
		MisVehiculos misVehiculos = new MisVehiculos();
		List<Object> lista = garantiaRepository.listCarsByCedula(id);
		for (Object o1 : lista) {
			for (int i = 0; i < lista.size(); i++) {
				misVehiculos.setChasis_vehiculo(lista.get(i).toString());
			}
			String chasis = Arrays.toString((Object[]) o1);

		}
		return listaMisVehiculos;
	}

}
