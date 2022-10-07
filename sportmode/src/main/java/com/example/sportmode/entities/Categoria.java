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
    private String denominacion;

    @OneToMany(mappedBy = "categoria",fetch = FetchType.EAGER)
    @Builder.Default
    private List<Producto> productos = new ArrayList<Producto>();
}
