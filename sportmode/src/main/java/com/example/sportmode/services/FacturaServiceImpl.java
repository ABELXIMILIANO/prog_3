package com.example.sportmode.services;

import com.example.sportmode.dtos.FacturaDTO;
import com.example.sportmode.entities.Factura;
import com.example.sportmode.mappers.FacturaMapper;
import com.example.sportmode.repositories.BaseRepository;
import com.example.sportmode.repositories.DomicilioRepository;
import com.example.sportmode.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
public  class FacturaServiceImpl extends BaseServiceImpl<Factura,Long, FacturaDTO> implements FacturaService {
    @Autowired
    FacturaRepository facturaRepository;
    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository) {

        super(baseRepository);
    }


}
