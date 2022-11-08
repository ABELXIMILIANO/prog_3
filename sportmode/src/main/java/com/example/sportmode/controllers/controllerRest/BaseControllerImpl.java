package com.example.sportmode.controllers.controllerRest;

import com.example.sportmode.controllers.BaseController;
import com.example.sportmode.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


public  class BaseControllerImpl <E,S extends BaseServiceImpl<E,Long,DTO>,DTO>implements BaseController<DTO,Long> {

    @Autowired
    protected S service;


    @GetMapping("")
    public ResponseEntity<?> getAll() {
       try {
           return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
       }catch (Exception E){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("error\":\"Error por favor intente más tarde.\"}");
       }
    }

    @GetMapping("/paged")
    public ResponseEntity<?> getAll(Pageable pageable) throws Exception {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAll(pageable));
        }catch (Exception E){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("error\":\"Error por favor intente más tarde.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
        }catch (Exception E){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error por favor intente más tarde.\"}");
        }
    }

    @Override
    public ResponseEntity<?> save(DTO dto) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.save(dto));
        }catch (Exception E){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error por favor intente más tarde.\"}");
        }
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<?> update(Long id, DTO dto) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.update(id,dto));
        }catch (Exception E){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error por favor intente más tarde.\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(service.delete(id));
        }catch (Exception E){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error por favor intente más tarde.\"}");
        }
    }
}
