package com.grupo3.Caso1.Dao.Posgrest.ordenReparacion;

import javax.transaction.Transactional;

import com.grupo3.Caso1.Model.ordenReparacion.DetalleRepuestos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface detallerepuestosServiceImp extends JpaRepository<DetalleRepuestos, Long> {
    @Transactional
    @Modifying
    @Query("UPDATE DetalleRepuestos set estado='APROBADO' WHERE id=:id")
    public void updateordenrepuesto(@Param("id") Long id);
}
