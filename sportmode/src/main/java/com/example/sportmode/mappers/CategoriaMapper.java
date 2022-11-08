package com.example.sportmode.mappers;

import com.example.sportmode.dtos.CategoriaDTO;
import com.example.sportmode.entities.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper(componentModel = "spring")
public interface CategoriaMapper extends EntityMapper<CategoriaDTO, Categoria> {
    CategoriaMapper INSTANCE= Mappers.getMapper(CategoriaMapper.class);





}
