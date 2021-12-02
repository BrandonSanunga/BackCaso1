package com.grupo3.Caso1.Service.Posgrest.ServiceImp;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Posgrest.informeRechazoRepositori;
import com.grupo3.Caso1.Model.InformeRechazo;
import com.grupo3.Caso1.Service.Posgrest.InformeRechazoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class InformeRechazoServiceImp extends GenericServiceImp<InformeRechazo, Long> implements InformeRechazoService {

    @Autowired
    private informeRechazoRepositori informeRechazoRepositori;

    @Override
    public CrudRepository<InformeRechazo, Long> getDao() {
        // TODO Auto-generated method stub
        return informeRechazoRepositori;
    }

}
