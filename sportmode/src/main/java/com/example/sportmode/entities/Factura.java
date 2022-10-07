package com.example.sportmode.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "factura")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Factura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date fecha;
    private int numero;
    private double total;

    @OneToMany(mappedBy = "factura", fetch = FetchType.EAGER, orphanRemoval = true)
    @Builder.Default
    private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_usuario", nullable = false)
    private Usuario usuario;
}
