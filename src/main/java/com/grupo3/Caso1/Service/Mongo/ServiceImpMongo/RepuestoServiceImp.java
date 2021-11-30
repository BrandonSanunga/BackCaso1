package com.grupo3.Caso1.Service.Mongo.ServiceImpMongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Mongo.RepuestoRepository;
import com.grupo3.Caso1.Model.Repuestos;
import com.grupo3.Caso1.Service.Mongo.RepuestoService;
import com.grupo3.Caso1.Service.Mongo.informeReparacionService;

@Service
public class RepuestoServiceImp extends GenericServiceImp<Repuestos, String> implements RepuestoService {

	@Autowired
	private RepuestoRepository repuestoRep;
	
	@Override
	public CrudRepository<Repuestos, String> getDao() {
		
		return repuestoRep;
	}
	

}
