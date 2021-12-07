package com.grupo3.Caso1.Service.Posgrest.ServiceImp.facturacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

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

	



	
}
