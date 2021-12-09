package com.grupo3.Caso1.Service.Postgres.ServiceImpPostgres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo3.Caso1.Dao.Postgres.CotizacionRepository;
import com.grupo3.Caso1.Model.Cotizacion;
import com.grupo3.Caso1.Service.Postgres.CotizacionService;

@Service
public class CotizacionServiceImp implements CotizacionService {
	
	@Autowired
	private CotizacionRepository cotizacionRepository;

	@Override
	public List<Cotizacion> findAll() {
		return cotizacionRepository.findAll();
	}

	@Override
	public Cotizacion save(Cotizacion cotizacion) {
		return cotizacionRepository.save(cotizacion);
	}

	@Override
	public void delete(Long id) {
		cotizacionRepository.deleteById(id);

	}

	@Override
	public Cotizacion findById(Long id) {
		return cotizacionRepository.findById(id).orElse(null);
	}

}
