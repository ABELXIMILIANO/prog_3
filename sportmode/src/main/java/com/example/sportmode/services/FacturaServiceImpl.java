package com.example.sportmode.services;

import com.example.sportmode.entities.Factura;
import com.example.sportmode.repositories.BaseRepository;
import com.example.sportmode.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class FacturaServiceImpl extends BaseServiceImpl<Factura,Long> implements FacturaService {
    @Autowired
    DomicilioRepository domicilioRepository;
    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository) {
        super(baseRepository);
    }
}
