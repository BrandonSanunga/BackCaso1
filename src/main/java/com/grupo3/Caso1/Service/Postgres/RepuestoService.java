package com.grupo3.Caso1.Service.Postgres;

import com.grupo3.Caso1.Commons.GenericService;
import com.grupo3.Caso1.Model.Repuestos;

import java.util.ArrayList;


public interface RepuestoService extends GenericService<Repuestos, String> {
    ArrayList<Repuestos> findAllByIdDisenio(String idDisenio);
}
