package com.example.sportmode.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private boolean admin;
    private int dni;
    private String email;
    private String contrasenia;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturas;
}
