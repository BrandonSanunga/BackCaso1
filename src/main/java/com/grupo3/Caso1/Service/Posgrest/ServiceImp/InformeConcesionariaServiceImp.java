package com.grupo3.Caso1.Service.Posgrest.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Posgrest.InformeConcesionariaRepositorio;
import com.grupo3.Caso1.Model.InformeConcecionaria;
import com.grupo3.Caso1.Service.Posgrest.InformeConcesionariaService;


@Service
public class InformeConcesionariaServiceImp extends GenericServiceImp<InformeConcecionaria, Long> implements InformeConcesionariaService{

	
	@Autowired
	private InformeConcesionariaRepositorio informe;
	@Override
	public CrudRepository<InformeConcecionaria, Long> getDao() {
		// TODO Auto-generated method stub
		return informe;
	}

}
