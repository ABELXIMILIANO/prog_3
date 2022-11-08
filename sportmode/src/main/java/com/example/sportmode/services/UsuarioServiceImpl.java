package com.example.sportmode.services;

import com.example.sportmode.dtos.UsuarioDTO;
import com.example.sportmode.entities.Usuario;
import com.example.sportmode.repositories.BaseRepository;
import com.example.sportmode.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class UsuarioServiceImpl extends BaseServiceImpl<Usuario,Long, UsuarioDTO> implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository) {
        super(baseRepository);
    }
}
