package com.example.sportmode.mappers;

import com.example.sportmode.dtos.FacturaDTO;
import com.example.sportmode.entities.Factura;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface FacturaMapper extends EntityMapper<FacturaDTO, Factura> {
    FacturaMapper INSTANCE = Mappers.getMapper(FacturaMapper.class);
}
