package com.example.sportmode.dtos;

import com.example.sportmode.entities.Producto;
import lombok.Data;

@Data
public class DetalleFacturaDTO {

    private Long id;
    private int cantidad;
    private double subtotal;
    private Producto producto;

}
