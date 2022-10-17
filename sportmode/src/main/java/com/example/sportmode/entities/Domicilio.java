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
    private String nombreCalle;
    private int numero;
    private int cp;
    private String localidad;
    private String provincia;

    @OneToOne(mappedBy = "domicilio")
    private Usuario usuario;

}
