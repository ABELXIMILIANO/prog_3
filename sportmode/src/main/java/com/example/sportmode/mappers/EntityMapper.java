package com.example.sportmode.mappers;

import com.example.sportmode.dtos.CategoriaDTO;
import com.example.sportmode.entities.Categoria;

import java.util.List;


public interface EntityMapper<DTO,E> {

    E toEntity(DTO entity);

    DTO toEntityDTO(E entityDTO);

    List<DTO> toListDTO(List<E> entityList);

    List<E> toEntityList(List<DTO> ListDTO);


}
