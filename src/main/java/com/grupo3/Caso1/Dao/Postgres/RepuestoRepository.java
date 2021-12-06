package com.grupo3.Caso1.Dao.Postgres;

import com.grupo3.Caso1.Model.Repuestos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface RepuestoRepository extends JpaRepository<Repuestos, String> {

    @Query("SELECT r FROM Repuestos r WHERE r.diseno.id_diseno = :idDisenio")
    ArrayList<Repuestos> findAllByIdDisenio(@Param("idDisenio") String idDisenio);

}
