package com.example.sportmode.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "factura")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Factura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private int numero;
    private double total;

    @OneToMany(mappedBy = "factura", orphanRemoval = true)
    private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();

    @ManyToOne
    @JoinColumn(name = "fk_usuario")
    private Usuario usuario;
}