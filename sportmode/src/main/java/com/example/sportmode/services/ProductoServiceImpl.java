package com.example.sportmode.services;

import com.example.sportmode.entities.Producto;
import com.example.sportmode.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto,Long> implements ProductoService{
    public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository) {
        super(baseRepository);
    }
}
