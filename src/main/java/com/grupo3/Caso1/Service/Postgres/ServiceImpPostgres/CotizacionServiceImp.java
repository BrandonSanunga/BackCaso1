package com.grupo3.Caso1.Service.Postgres.ServiceImpPostgres;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo3.Caso1.Commons.MailAttachment;
import com.grupo3.Caso1.Commons.Utils;
import com.grupo3.Caso1.Dao.Postgres.CotizacionRepository;
import com.grupo3.Caso1.Model.Cotizacion;
import com.grupo3.Caso1.Reports.Report;
import com.grupo3.Caso1.Reports.ReporteCotizacionContext;
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

	@Override
	public Map<String, Object> enviarEmail(Long id) throws MessagingException {
		Map<String, Object> json = new HashMap<>();
		Cotizacion cotizacion= null;
		try {
			cotizacion=cotizacionRepository.findById(id).orElse(null);
		} catch (Exception e) {
			
		}
			
		if (cotizacion!=null) {
			String pdfPath= this.generarReporteCotizacion(id);
			 List<MailAttachment> attachments = List.of(new MailAttachment("Cotizacion Vehiculo.pdf", pdfPath));
			 String email=cotizacion.getCliente().getEmailClient();
			 Boolean enviado = Utils.enviarEmail(email, "StarMotorsG3@gmail.com", "Reporte Cotizacion Vehiculo", "Reporte Cotizacion Vehiculo", attachments);
			  if (enviado) {
	                json.put("email", email);
	                json.put("status", "enviado");
	                return json;
	            }
		}
		 json.put("status", "error");

	        return json;
	}

	@Override
	public String generarReporteCotizacion(Long id) {
		ReporteCotizacionContext context = new ReporteCotizacionContext();
	   Cotizacion cotizacion=  null;
		cotizacion= cotizacionRepository.findById(id).orElse(null);
	
		String marca= cotizacion.getVehiculo_catalogo().getDiseno().getMarca();
		context.setMarca(marca);
		String modelo=cotizacion.getVehiculo_catalogo().getDiseno().getModelo();    
		context.setModelo(modelo);
		Integer year=cotizacion.getVehiculo_catalogo().getYear_vehiculo();
		context.setYear(year);
		String capacidad_carga=cotizacion.getVehiculo_catalogo().getCaracteristica().getCapacidad_carga();
		context.setCapacidad_carga(capacidad_carga);
		String direccion=cotizacion.getVehiculo_catalogo().getCaracteristica().getDireccion();
		context.setDireccion(direccion);
		Integer cilindros=cotizacion.getVehiculo_catalogo().getCaracteristica().getCilindros();
		context.setCilindros(cilindros);
		String motor=cotizacion.getVehiculo_catalogo().getCaracteristica().getMotor();
		context.setMotor(motor);
		String tecnologia=cotizacion.getVehiculo_catalogo().getCaracteristica().getMotor();
		context.setTecnologia(tecnologia);
		Double precio=cotizacion.getTotal();   
		context.setPrecio(precio);
		String nombres_cliente=cotizacion.getCliente().getNombresClient();
		context.setNombres_cliente(nombres_cliente);
		
		Report<ReporteCotizacionContext> report=new Report<>("reporte_cotizacion", context);
		report.generate();
		
		return  report.getReportOutPdfName();
	}

}
