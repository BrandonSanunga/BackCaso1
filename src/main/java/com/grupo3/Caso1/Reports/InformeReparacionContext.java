package com.grupo3.Caso1.Reports;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InformeReparacionContext {
    private String orden;
    private String cliente;
    private String fecha;
    private String estado;
    private String observaciones;
    private String detallesLabels;
    private String detallesValues;
    private String nombresRepuestos;
}
