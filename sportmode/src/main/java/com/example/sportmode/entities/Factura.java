package com.example.sportmode.entities;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

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


    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Factura_facturaDetalle",
            joinColumns = @JoinColumn(name = "factura_id"),
            inverseJoinColumns = @JoinColumn(name = "facturaDetalle_id")
    )
    private List<DetalleFactura> detallesFactura = new ArrayList<DetalleFactura>();
}