package com.grupo3.Caso1.Service.Posgrest.ServiceImp;

import javax.servlet.http.PushBuilder;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Posgrest.informeReclamoRepositori;
import com.grupo3.Caso1.Model.InformeReclamo;
import com.grupo3.Caso1.Service.Posgrest.InformeReclamoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class InformeReclamoServiceImp extends GenericServiceImp<InformeReclamo, Long> implements InformeReclamoService {

    @Autowired
    private informeReclamoRepositori informeRechazoRepositori;

    @Override
    public CrudRepository<InformeReclamo, Long> getDao() {
        // TODO Auto-generated method stub
        return informeRechazoRepositori;
    }

    public InformeReclamo update(InformeReclamo informeReclamo, Long id) {
        if (informeRechazoRepositori.findById(id) != null) {
            informeReclamo.setIdinformeRecha(id);
            return informeRechazoRepositori.save(informeReclamo);
        } else {
            return null;
        }
    }
}
