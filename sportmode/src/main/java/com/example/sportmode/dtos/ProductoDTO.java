package com.example.sportmode.dtos;

import com.example.sportmode.entities.Categoria;
import lombok.Data;



@Data
public class ProductoDTO {
    private Long id;
    private String nombre;
    private double precio;
    private int stock;
    private boolean activo;
    private String talle;
    private String color;
    private Categoria categoria;
    private String imagenIlustracion;
}
