package com.grupo3.Caso1.Service.Postgres;

import com.grupo3.Caso1.Commons.GenericService;
import com.grupo3.Caso1.Model.Repuestos;

<<<<<<< HEAD
public interface RepuestoService extends GenericService<Repuestos, Long>{
=======
import java.util.ArrayList;
>>>>>>> 4c888d1aa56cdd0b35876a293895b1071b84ada3


public interface RepuestoService extends GenericService<Repuestos, String> {
    ArrayList<Repuestos> findAllByIdDisenio(String idDisenio);
}
