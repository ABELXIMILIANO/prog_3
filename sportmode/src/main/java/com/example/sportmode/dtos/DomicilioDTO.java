package com.example.sportmode.dtos;

import lombok.Data;


@Data
public class DomicilioDTO {
    private Long id;
    private String nombreCalle;
    private int numero;
    private int cp;
    private String localidad;
    private String provincia;

}
