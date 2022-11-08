package com.example.sportmode.services;

import com.example.sportmode.dtos.CategoriaDTO;
import com.example.sportmode.entities.Categoria;
import com.example.sportmode.mappers.CategoriaMapper;
import com.example.sportmode.repositories.BaseRepository;
import com.example.sportmode.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria,Long, CategoriaDTO>  implements CategoriaService{
    @Autowired
    CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository) {
        super(baseRepository);
    }
}
