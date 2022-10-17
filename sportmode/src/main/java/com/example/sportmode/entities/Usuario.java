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
@Builder
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int id;
    private String nombre;
    private String apellido;
    private boolean admin;
    private int dni;
    private String email;
    private String contrasenia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_domicilio",nullable = false)
    private Domicilio domicilio;

    @OneToMany(mappedBy = "usuario")
    @Builder.Default
    private List<Factura> facturas = new ArrayList<Factura>();

}
