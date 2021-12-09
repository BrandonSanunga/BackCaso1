package com.grupo3.Caso1.Dao.Posgrest.ordenReparacion;

import com.grupo3.Caso1.Model.ordenReparacion.ordenRepCavecera;
import com.grupo3.Caso1.Model.ordenReparacion.ordenRepCuerpo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ordenRepCuerpoRepo extends JpaRepository<ordenRepCuerpo, Long> {

    @Query("SELECT o FROM ordenRepCuerpo o WHERE o.estadoOrden = :estado")
    List<ordenRepCuerpo> getOrdenesTaller(@Param("estado") String estado);
}
