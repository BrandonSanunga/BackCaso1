package com.grupo3.Caso1.Service.Posgrest.ServiceImp.facturacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Posgrest.facturacion.SolicitudGarantiaRepository;
import com.grupo3.Caso1.Model.SolicitudGarantia;
import com.grupo3.Caso1.Service.Posgrest.SolicitudGarantiaService;

@Service
public class SolicitudGarantiaServImpl extends GenericServiceImp<SolicitudGarantia, Long>
implements SolicitudGarantiaService{
	@Autowired
	private SolicitudGarantiaRepository garantiaRepository;

	@Override
	public CrudRepository<SolicitudGarantia, Long> getDao() {
		// TODO Auto-generated method stub
		return garantiaRepository;
	}

	public List<SolicitudGarantia> findAllByEstado(Boolean estado){
		List<SolicitudGarantia> solGaranrespuesta= new ArrayList<>();
		List<SolicitudGarantia> solicitudes = garantiaRepository.findAll(); 
		for (int i=0; i<solicitudes.size();i++) {
			if(solicitudes.get(i).isEstado_solicitud()==estado) {
				solGaranrespuesta.add(solicitudes.get(i));
			}
	   }
		return solGaranrespuesta;
   }

	public void cambiarEstadoSolicitud(Long id) {
		garantiaRepository.cambiarEstadoReclamo(id);
	}
	
	public List<Object> listCarsByCedula(String id){
		List<Object> lista = new ArrayList<>();
		lista.add(garantiaRepository.listCarsByCedula(id));
		return lista;
	}

	
}
