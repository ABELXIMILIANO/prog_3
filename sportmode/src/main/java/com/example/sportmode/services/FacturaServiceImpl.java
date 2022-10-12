package com.example.sportmode.services;

import com.example.sportmode.entities.Factura;
import com.example.sportmode.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public  class FacturaServiceImpl extends BaseServiceImpl<Factura,Long> implements FacturaService {
    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository) {
        super(baseRepository);
    }
}
