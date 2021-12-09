package com.grupo3.Caso1.Service.Posgrest.ServiceImp.OrdenReparacion;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Posgrest.ordenReparacion.ordenRepCuerpoRepo;
import com.grupo3.Caso1.Model.ordenReparacion.ordenRepCavecera;
import com.grupo3.Caso1.Model.ordenReparacion.ordenRepCuerpo;
import com.grupo3.Caso1.Service.Posgrest.ordenReparacion.ordenRepCuerpoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ordenRepaCuerpoServiceImp extends GenericServiceImp<ordenRepCuerpo, Long> implements ordenRepCuerpoService {

    @Autowired
    private ordenRepCuerpoRepo ordenRepCuerpoRepo;

    @Override
    public CrudRepository<ordenRepCuerpo, Long> getDao() {
        // TODO Auto-generated method stub
        return ordenRepCuerpoRepo;
    }

    public ordenRepCuerpo update(ordenRepCuerpo ordenRepCuerpo, Long id) {
        if (ordenRepCuerpoRepo.findById(id) != null) {
            return ordenRepCuerpoRepo.save(ordenRepCuerpo);
        } else {
            return null;
        }
    }

    @Override
    public List<Map<String, Object>> getOrdenesTaller() {
        List<Map<String, Object>> ordenes = new ArrayList<>();
        List<ordenRepCuerpo> ordenesRep = ordenRepCuerpoRepo.getOrdenesTaller();
        ordenesRep.forEach(obj -> {
            ordenes.add(Map.ofEntries(
                    Map.entry("persona", obj.getOrdenRepCavecera().getInspeCuerpo().getInspeCavecera().getInformeReclamo().getClient().getClienteObject()),
                    Map.entry("fechaIngreso", obj.getOrdenRepCavecera().getFechaIngreso())
            ));
        });
        return ordenes;
    }
}
