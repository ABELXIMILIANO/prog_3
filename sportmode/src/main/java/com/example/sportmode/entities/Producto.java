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
    private String nombre;
    private double precio;
    private int stock;
    private boolean activo;
    private String talle;
    private String color;

    @OneToMany(mappedBy = "producto",fetch = FetchType.EAGER)
    @Builder.Default
    private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "fk_categoria", nullable = false)
    private Categoria categoria;

}
