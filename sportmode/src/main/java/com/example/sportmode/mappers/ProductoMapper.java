package com.example.sportmode.mappers;

import com.example.sportmode.dtos.ProductoDTO;
import com.example.sportmode.entities.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductoMapper extends EntityMapper<ProductoDTO, Producto>{
    ProductoMapper INSTANCE = Mappers.getMapper(ProductoMapper.class);
}
