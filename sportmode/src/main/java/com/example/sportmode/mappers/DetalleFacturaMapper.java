package com.example.sportmode.mappers;

import com.example.sportmode.dtos.DetalleFacturaDTO;
import com.example.sportmode.entities.DetalleFactura;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface DetalleFacturaMapper extends EntityMapper<DetalleFacturaDTO, DetalleFactura> {
    DetalleFacturaMapper INSTANCE = Mappers.getMapper(DetalleFacturaMapper.class);
}
