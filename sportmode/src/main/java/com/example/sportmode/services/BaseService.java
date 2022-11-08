package com.example.sportmode.services;

import com.example.sportmode.mappers.EntityMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService <DTO, ID extends Serializable> {
    public List<DTO> findAll() throws Exception;
    public Page<DTO> findAll(Pageable pageable) throws Exception; // este metodo lo vamos a utilizar despues.Por el momento solo lo vamos a dejar.
    public DTO findById(ID id) throws Exception;
    public DTO save(DTO entity) throws Exception;
    public DTO update (ID id, DTO entity) throws Exception;
    public boolean delete(ID id) throws Exception;
}
