package com.grupo3.Caso1.Dao.Posgrest.facturacion;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo3.Caso1.Model.DetalleFacturaClient;

public interface DetalleCliRepository extends JpaRepository<DetalleFacturaClient, Long>{

}
