package com.grupo3.Caso1.Service.Postgres.ServiceImpPostgres;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Postgres.RepuestoRepository;
import com.grupo3.Caso1.Model.Repuestos;
import com.grupo3.Caso1.Service.Postgres.RepuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class RepuestoServiceImp extends GenericServiceImp<Repuestos, String> implements RepuestoService {

    @Autowired
    private RepuestoRepository repuestoRep;

    @Override
    public CrudRepository<Repuestos, String> getDao() {

        return repuestoRep;
    }

    public ArrayList<Repuestos> findAllByIdDisenio(String idDisenio) {
        return repuestoRep.findAllByIdDisenio(idDisenio);
    }

}
