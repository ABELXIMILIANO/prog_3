package com.example.sportmode.mappers;

import com.example.sportmode.dtos.DomicilioDTO;
import com.example.sportmode.entities.Domicilio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface DomicilioMapper extends EntityMapper<DomicilioDTO, Domicilio> {
   DomicilioMapper INSTANCE = Mappers.getMapper(DomicilioMapper.class);
}
