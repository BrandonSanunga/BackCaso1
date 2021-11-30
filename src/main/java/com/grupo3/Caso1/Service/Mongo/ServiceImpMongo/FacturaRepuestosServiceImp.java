package com.grupo3.Caso1.Service.Mongo.ServiceImpMongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Mongo.FacturaRepuestosRepository;
import com.grupo3.Caso1.Model.FacturaRepuestos;
import com.grupo3.Caso1.Service.Mongo.FacturaRepuestoService;

@Service
public class FacturaRepuestosServiceImp extends GenericServiceImp<FacturaRepuestos, String> implements FacturaRepuestoService{

	@Autowired
	private FacturaRepuestosRepository facturaRep;
	
	@Override
	public CrudRepository<FacturaRepuestos, String> getDao() {
		// TODO Auto-generated method stub
		return facturaRep;
	}

}
