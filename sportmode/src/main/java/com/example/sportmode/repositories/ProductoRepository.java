package com.example.sportmode.repositories;

import com.example.sportmode.entities.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends BaseRepository<Producto,Long>{

    @Query(value = "SELECT * FROM productos WHERE productos.nombre LIKE %:q% AND productos.activo =true", nativeQuery = true)
    List<Producto> findByName(@Param("q")String q);
}
