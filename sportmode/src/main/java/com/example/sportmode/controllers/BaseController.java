package com.example.sportmode.controllers;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <DTO,ID extends Serializable> {
    public ResponseEntity<?>getAll();
    public ResponseEntity<?>getAll(Pageable pageable )throws Exception;
    public ResponseEntity<?>getOne(@PathVariable ID id);// @PathVariable: Esta anotación se utiliza para anotar argumentos del método del controlador de solicitudes.
    public ResponseEntity<?>save(@RequestBody DTO dto);//@RequestBody indica que un parámetro de método debe estar vinculado al valor del cuerpo de la solicitud HTTP.
    public ResponseEntity<?>update(@PathVariable ID id,@RequestBody DTO dto);
    public ResponseEntity<?>delete(@PathVariable ID id);

}

