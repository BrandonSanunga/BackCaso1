package com.grupo3.Caso1.Service.Posgrest.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Posgrest.VehiculoRepository;
import com.grupo3.Caso1.Model.Vehiculo;
import com.grupo3.Caso1.Service.Posgrest.VehiculoService;

@Service
public class VehiculoServiceImp extends GenericServiceImp<Vehiculo, Long> implements VehiculoService {

	@Autowired
	private VehiculoRepository vehiculo;

	@Override
	public CrudRepository<Vehiculo, Long> getDao() {
		// TODO Auto-generated method stub
		return vehiculo;
	}

}