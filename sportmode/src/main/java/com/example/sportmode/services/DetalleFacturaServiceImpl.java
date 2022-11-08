package com.example.sportmode.services;

import com.example.sportmode.dtos.DetalleFacturaDTO;
import com.example.sportmode.entities.DetalleFactura;
import com.example.sportmode.mappers.DetalleFacturaMapper;
import com.example.sportmode.repositories.BaseRepository;
import com.example.sportmode.repositories.DetalleFacturaRepository;
import com.example.sportmode.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class DetalleFacturaServiceImpl extends BaseServiceImpl<DetalleFactura,Long, DetalleFacturaDTO> implements DetalleFacturaService{
    @Autowired
    DetalleFacturaRepository detalleFacturaRepository;
    public DetalleFacturaServiceImpl(BaseRepository<DetalleFactura, Long> baseRepository) {
        super(baseRepository);
    }
}
