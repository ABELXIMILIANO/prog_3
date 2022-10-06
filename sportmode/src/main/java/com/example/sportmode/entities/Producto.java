package com.example.sportmode.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="precio")
    private double precio;

    @Column(name="stock")
    private int stock;

    @Column(name="activo")
    private boolean activo;

    @Column(name="talle")
    private String talle;

    @Column(name="color")
    private String color;

    @OneToMany(mappedBy = "producto",cascade = CascadeType.PERSIST)
    @Builder.Default
    private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name= "producto_fk_categoria")
    private Categoria categoria;

}
