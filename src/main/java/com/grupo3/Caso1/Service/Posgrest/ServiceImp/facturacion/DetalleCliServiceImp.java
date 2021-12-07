package com.grupo3.Caso1.Service.Posgrest.ServiceImp.facturacion;
import com.grupo3.Caso1.Dao.Posgrest.facturacion.DetalleCliRepository;
import com.grupo3.Caso1.Service.Posgrest.DetalleCliService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Model.DetalleFacturaClient;

@Service
public class DetalleCliServiceImp  extends GenericServiceImp<DetalleFacturaClient, Long> implements DetalleCliService{

	@Autowired
	private DetalleCliRepository detalleRepository;

	@Override
	public CrudRepository<DetalleFacturaClient, Long> getDao() {
		// TODO Auto-generated method stub
		return detalleRepository;
	}
	
	public List<DetalleFacturaClient> findAllByFatura(Long id){
		 List<DetalleFacturaClient> detallerespuesta= new ArrayList<>();
		 List<DetalleFacturaClient> detalles = detalleRepository.findAll(); 
		 for (int i=0; i<detalles.size();i++) {
			 if(detalles.get(i).getFk_id_factura().getId_factura()==id) {
				 detallerespuesta.add(detalles.get(i));
			 }
		}
		 return detallerespuesta;
		 
	}
}
