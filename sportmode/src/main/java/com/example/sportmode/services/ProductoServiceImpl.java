package com.example.sportmode.services;

import com.example.sportmode.dtos.ProductoDTO;
import com.example.sportmode.entities.Producto;
import com.example.sportmode.mappers.ProductoMapper;
import com.example.sportmode.repositories.BaseRepository;
import com.example.sportmode.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto,Long, ProductoDTO> implements ProductoService{
    @Autowired
    ProductoRepository productoRepository;
    public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository) {
        super(baseRepository);
    }
}
