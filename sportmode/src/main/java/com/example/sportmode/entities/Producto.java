package com.example.sportmode.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private double precio;
    private int stock;
    private boolean activo;
    private String talle;
    private String color;

    @OneToMany(mappedBy = "producto")
    private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();

    @ManyToOne
    @JoinColumn(name= "fk_categoria")
    private Categoria categoria;

}