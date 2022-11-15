package com.example.sportmode.services;


import com.example.sportmode.entities.DetalleOrden;
import com.example.sportmode.repositories.BaseRepository;
import com.example.sportmode.repositories.DetalleOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleOrdenServiceImpl extends BaseServiceImpl<DetalleOrden,Long>  implements DetalleOrdenService {
    @Autowired
    DetalleOrdenRepository detalleOrdenRepository;
    public DetalleOrdenServiceImpl(BaseRepository<DetalleOrden, Long> baseRepository) {
        super(baseRepository);
    }
}
