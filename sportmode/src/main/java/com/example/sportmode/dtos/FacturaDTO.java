package com.example.sportmode.dtos;


import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class FacturaDTO {
    private Long id;
    private Date fecha;
    private int numero;
    private double total;
    private List<DetalleFacturaDTO>detallesfacturas;
}
