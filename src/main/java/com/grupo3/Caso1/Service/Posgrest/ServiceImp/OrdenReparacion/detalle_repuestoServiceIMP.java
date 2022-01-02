package com.grupo3.Caso1.Service.Posgrest.ServiceImp.OrdenReparacion;

import java.util.List;
import java.util.Optional;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Posgrest.ordenReparacion.detallerepuestosServiceImp;
import com.grupo3.Caso1.Model.ordenReparacion.DetalleRepuestos;
import com.grupo3.Caso1.Service.Posgrest.ordenReparacion.detallerespservi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class detalle_repuestoServiceIMP extends GenericServiceImp<DetalleRepuestos, Long>
        implements detallerespservi {

    @Autowired
    private detallerepuestosServiceImp detallerepuestosServiceImp;

    @Override
    public CrudRepository<DetalleRepuestos, Long> getDao() {
        // TODO Auto-generated method stub
        return null;
    }

    public void updateidestado(Long id) {
        detallerepuestosServiceImp.updateordenrepuesto(id);
    }

}
