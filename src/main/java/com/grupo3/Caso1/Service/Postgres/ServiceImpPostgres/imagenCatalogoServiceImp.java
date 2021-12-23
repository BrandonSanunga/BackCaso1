package com.grupo3.Caso1.Service.Postgres.ServiceImpPostgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Postgres.ImagenCatalogoReposiory;
import com.grupo3.Caso1.Model.ImagenCatalogo;
import com.grupo3.Caso1.Service.Postgres.ImagenCatalogoService;

@Service
public class imagenCatalogoServiceImp extends GenericServiceImp<ImagenCatalogo, Long> implements ImagenCatalogoService{

	@Autowired
	private ImagenCatalogoReposiory imagenRepository;
	
	@Override
	public CrudRepository<ImagenCatalogo, Long> getDao() {
		
		return imagenRepository;
	}

	
}
