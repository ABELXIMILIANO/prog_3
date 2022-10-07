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
    private int cantidad;
    private double subtotal;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_producto", nullable = false)
    private Producto producto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "fk_factura", nullable = false)
    private Factura factura;


}
