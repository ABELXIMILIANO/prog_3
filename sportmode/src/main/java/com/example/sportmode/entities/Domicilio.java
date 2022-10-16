package com.example.sportmode.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="domicilio")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Domicilio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCalle;
    private int numero;
    private int cp;
    private String localidad;
    private String provincia;

}
