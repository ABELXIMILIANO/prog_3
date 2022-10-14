package com.example.sportmode.services;

import com.example.sportmode.entities.Categoria;
import com.example.sportmode.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria,Long>  implements CategoriaService{
    public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository) {
        super(baseRepository);
    }
}
