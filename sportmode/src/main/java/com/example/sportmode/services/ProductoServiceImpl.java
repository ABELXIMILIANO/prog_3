package com.example.sportmode.services;

import com.example.sportmode.entities.Producto;
import com.example.sportmode.repositories.BaseRepository;
import com.example.sportmode.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto,Long> implements ProductoService{
    @Autowired
    ProductoRepository productoRepository;
    public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository) {
        super(baseRepository);
    }

    @Transactional
    public List<Producto> findByName(String q) throws Exception{
        try{
            List<Producto> entities = this.productoRepository.findByName(q);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
