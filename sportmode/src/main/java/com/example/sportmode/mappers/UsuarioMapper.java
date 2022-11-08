package com.example.sportmode.mappers;

import com.example.sportmode.dtos.UsuarioDTO;
import com.example.sportmode.entities.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UsuarioMapper extends EntityMapper<UsuarioDTO, Usuario>{
    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
}
