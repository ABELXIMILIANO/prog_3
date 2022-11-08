package com.example.sportmode.dtos;
import lombok.Data;

import java.util.List;

@Data
public class UsuarioDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private boolean admin;
    private int dni;
    private String email;
    private List<FacturaDTO> facturas;

}
