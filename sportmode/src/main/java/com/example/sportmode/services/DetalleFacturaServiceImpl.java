package com.example.sportmode.services;

import com.example.sportmode.entities.DetalleFactura;
import com.example.sportmode.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public  class DetalleFacturaServiceImpl extends BaseServiceImpl<DetalleFactura,Long> implements DetalleFacturaService{
    public DetalleFacturaServiceImpl(BaseRepository<DetalleFactura, Long> baseRepository) {
        super(baseRepository);
    }
}
