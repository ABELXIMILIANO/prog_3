package com.example.sportmode.services;

import com.example.sportmode.dtos.DomicilioDTO;
import com.example.sportmode.entities.Domicilio;
import com.example.sportmode.mappers.DetalleFacturaMapper;
import com.example.sportmode.mappers.DomicilioMapper;
import com.example.sportmode.repositories.BaseRepository;
import com.example.sportmode.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long, DomicilioDTO> implements DomicilioService{
    @Autowired
    DomicilioRepository domicilioRepository;
    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
