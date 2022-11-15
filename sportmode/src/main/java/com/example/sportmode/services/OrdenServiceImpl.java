package com.example.sportmode.services;

import com.example.sportmode.entities.Orden;
import com.example.sportmode.repositories.BaseRepository;
import com.example.sportmode.repositories.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class OrdenServiceImpl extends BaseServiceImpl<Orden,Long> implements OrdenService {
    @Autowired
    OrdenRepository detalleFacturaRepository;
    public OrdenServiceImpl(BaseRepository<Orden, Long> baseRepository) {
        super(baseRepository);
    }
}
