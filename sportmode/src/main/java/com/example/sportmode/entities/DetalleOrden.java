package com.example.sportmode.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "detalles")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DetalleOrden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private double cantidad;
	private double precio;
	private double total;


	@ManyToOne
	@JoinColumn(name = "fk_producto")
	private Producto producto;
	



}
