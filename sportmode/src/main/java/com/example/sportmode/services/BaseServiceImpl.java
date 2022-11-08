package com.example.sportmode.services;

import com.example.sportmode.mappers.EntityMapper;
import com.example.sportmode.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;




public abstract class BaseServiceImpl<E,ID extends Serializable,DTO> implements BaseService<DTO,ID>{

    @Autowired
    protected BaseRepository<E,ID> baseRepository;

    @Autowired
    protected EntityMapper<DTO,E> mapper;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }


    @Override
    @Transactional
    public List<DTO> findAll() throws Exception {
        try {

            List<DTO> DTOs = mapper.toListDTO(baseRepository.findAll());


            return  DTOs;
        }catch(Exception e ){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Page<DTO> findAll(Pageable pageable) throws Exception {
        try{
          // Page<DTO> listDTO=mapper.toListDTO(baseRepository.findAll(pageable));//necesito hacer un metodo en el entity implemnts
            return null;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


    @Override
    @Transactional
    public DTO findById(ID id) throws Exception {
        try {
            Optional<E> entityOptional=baseRepository.findById(id);

            return  mapper.toEntityDTO(entityOptional.get());
        }catch(Exception e ){
            throw new Exception(e.getMessage());

        }
    }

    @Override
    @Transactional
    public DTO save(DTO dto) throws Exception {
        try {
            E entity= baseRepository.save(mapper.toEntity(dto));
            return mapper.toEntityDTO(entity);
        }catch( Exception e ){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public DTO update(ID id, DTO dto) throws Exception {
        try {
            Optional<E>entityOptional=baseRepository.findById(id);//en esta línea obtengo la entidad que quiero actualzar
            E entityUpdate=entityOptional.get(); //en esta linea guardo la entity en un objeto de tipo generico"E" llamado entityUpdate
            entityUpdate=baseRepository.save(mapper.toEntity(dto));//en esta línea
            return mapper.toEntityDTO(entityUpdate);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            baseRepository.deleteById(id);
            return true;
        }catch(Exception e  ){
            throw new Exception(e.getMessage());
        }
    }
}
