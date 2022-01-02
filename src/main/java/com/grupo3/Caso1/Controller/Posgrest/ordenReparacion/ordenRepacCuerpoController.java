package com.grupo3.Caso1.Controller.Posgrest.ordenReparacion;

import com.grupo3.Caso1.Model.Vehiculo;
import com.grupo3.Caso1.Model.ordenReparacion.ordenRepCavecera;
import com.grupo3.Caso1.Model.ordenReparacion.ordenRepCuerpo;
import com.grupo3.Caso1.Service.Posgrest.ServiceImp.OrdenReparacion.ordenRepaCuerpoServiceImp;
import com.grupo3.Caso1.Service.Posgrest.ordenReparacion.ordenRepCuerpoService;
import com.grupo3.Caso1.Service.Posgrest.ordenReparacion.ordenRepaCaveceraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/ordecuerpo/api/v1")
@CrossOrigin("*")
public class ordenRepacCuerpoController {
    @Autowired
    public ordenRepCuerpoService ordenRepCuerpoService;
    @Autowired
    public ordenRepaCuerpoServiceImp ordenRepaCuerpoServiceImp2;
    @Autowired
    private ordenRepaCaveceraService ordenRepaCaveceraService;

    @GetMapping(value = "/getall")
    public List<ordenRepCuerpo> getAll() {
        return ordenRepCuerpoService.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public ordenRepCuerpo find(@PathVariable(value = "id") Long id) {
        return ordenRepCuerpoService.get(id);
    }

    @PostMapping(value = "/save/{trabajoSolicitado}/{trabajoRealizar}/{observaciones}/{imagenes}/{estadoOrden}/{inspeccion}")
    public ResponseEntity<ordenRepCuerpo> save(
            @PathVariable(name = "trabajoSolicitado") String trabajoSolicitado,
            @PathVariable(name = "trabajoRealizar") String trabajoRealizar,
            @PathVariable(name = "observaciones") String observaciones,
            @PathVariable(name = "imagenes") String imagenes,
            @PathVariable(name = "estadoOrden") String estadoOrden,
            @PathVariable(name = "inspeccion") Long inspeccion) {
        ordenRepCuerpo ord = new ordenRepCuerpo();
        ord.setTrabajoSolicitado(trabajoSolicitado);
        ord.setTrabajoRealizar(trabajoRealizar);
        ord.setObservaciones(observaciones);
        ord.setImagenes(imagenes);
        ord.setEstadoOrden("EN REVISION DEL TALLER");
        ordenRepCavecera ordencv = new ordenRepCavecera();
        ordencv = ordenRepaCaveceraService.get(inspeccion);
        ord.setOrdenRepCavecera(ordencv);
        ordenRepCuerpo ord1 = ordenRepCuerpoService.save(ord);
        return new ResponseEntity<ordenRepCuerpo>(ord, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{idordenCuerpo}")
    public ResponseEntity<Boolean> delete(@PathVariable("idordenCuerpo") Long idordenCuerpo) {
        ordenRepCuerpoService.delete(idordenCuerpo);
        return ResponseEntity.ok(!(ordenRepCuerpoService.get(idordenCuerpo) != null));
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<ordenRepCuerpo> update(@PathVariable(name = "id") Long id,
            @RequestBody ordenRepCuerpo ordenRepCuerpo) {
        if (ordenRepaCuerpoServiceImp2.update(ordenRepCuerpo, id) != null) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping("/orden-by-id/{id}")
    public Map<String, Object> getOrdenById(@PathVariable(name = "id") Long id) {
        return ordenRepaCuerpoServiceImp2.getOrdenById(id);
    }

    @PutMapping("/cambiar-estado-orden/{id}")
    public Map<String, Object> cambiarEstadoOrden(@PathVariable(name = "id") Long id, @RequestBody String estado) {
        return ordenRepaCuerpoServiceImp2.cambiarEstadoOrdenById(id, estado);
    }
    
   
	//LISTAR POR ESTADO LOS ORDENES 
	@GetMapping("est/{estado}")
	private ResponseEntity<List<ordenRepCuerpo>> getAllSoliGarTrue(@PathVariable("estado") String estado){
		return ResponseEntity.ok(ordenRepaCuerpoServiceImp2.findAllByEstado(estado));
	}


    @RequestMapping(value = "/updatestadorep/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateEstadoRep(@PathVariable(name = "id") Long id) {
        ordenRepaCuerpoServiceImp2.ordenEstadoUpdate(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
