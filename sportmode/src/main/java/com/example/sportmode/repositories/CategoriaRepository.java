package com.example.sportmode.repositories;

import com.example.sportmode.entities.Categoria;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends  BaseRepository<Categoria,Long> {
}
