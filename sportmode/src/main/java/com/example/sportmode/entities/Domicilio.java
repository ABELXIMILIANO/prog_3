package com.example.sportmode.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="domicilio")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Domicilio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "nombre_calle")
    private String nombreCalle;

    @Column (name = "numero")
    private int numero;

    @Column (name = "CP")
    private int cp;

    @Column (name = "localidad")
    private String localidad;

    @Column (name = "provincia")
    private String provincia;

    @OneToOne(mappedBy = "domicilio")
    private Usuario usuario;

}
