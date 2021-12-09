package com.grupo3.Caso1.Dao.Postgres;

import com.grupo3.Caso1.Model.Repuestos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

<<<<<<< HEAD
public interface RepuestoRepository extends JpaRepository<Repuestos, Long>{
=======
import java.util.ArrayList;

public interface RepuestoRepository extends JpaRepository<Repuestos, String> {

    @Query("SELECT r FROM Repuestos r WHERE r.diseno.id_diseno = :idDisenio")
    ArrayList<Repuestos> findAllByIdDisenio(@Param("idDisenio") String idDisenio);
>>>>>>> 4c888d1aa56cdd0b35876a293895b1071b84ada3

}
