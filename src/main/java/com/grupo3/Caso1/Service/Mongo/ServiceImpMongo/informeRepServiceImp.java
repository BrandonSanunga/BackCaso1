package com.grupo3.Caso1.Service.Mongo.ServiceImpMongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Mongo.informeReparacionRepository;
import com.grupo3.Caso1.Model.informeReparacion;
import com.grupo3.Caso1.Service.Mongo.informeReparacionService;

@Service
public class informeRepServiceImp extends GenericServiceImp<informeReparacion, String> implements informeReparacionService{

	@Autowired
	private informeReparacionRepository informeRepository;

	@Override
	public CrudRepository<informeReparacion, String> getDao() {

		return informeRepository;
	}
	
	
}
