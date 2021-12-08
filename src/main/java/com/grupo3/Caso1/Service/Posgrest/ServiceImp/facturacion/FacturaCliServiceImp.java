package com.grupo3.Caso1.Service.Posgrest.ServiceImp.facturacion;
import com.grupo3.Caso1.Dao.Posgrest.facturacion.FacturaCliRepository;
import com.grupo3.Caso1.Service.Posgrest.FacturaCliService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Model.FacturaClient;

@Service
public class FacturaCliServiceImp extends GenericServiceImp<FacturaClient, Long> implements FacturaCliService{

	@Autowired
	private FacturaCliRepository facturaCliRepository;

	@Override
	public CrudRepository<FacturaClient, Long> getDao() {
		// TODO Auto-generated method stub
		return facturaCliRepository;
	}

	
	
}
