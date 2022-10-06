package com.example.sportmode.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "detalle_factura")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DetalleFactura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "subtotal")
    private double subtotal;

    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_producto")
    private Producto producto;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name= "detalle_fk_factura")
    private Factura factura;


}
