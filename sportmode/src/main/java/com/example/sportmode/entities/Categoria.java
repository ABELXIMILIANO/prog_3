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
@Table(name="categoria")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "denominacion")
    private String denominacion;

    @OneToMany(mappedBy = "producto",cascade = CascadeType.PERSIST)
    @Builder.Default
    private List<Producto> productos = new ArrayList<Producto>();
}
