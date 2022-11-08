package com.example.sportmode.controllers.controllerRest;

import com.example.sportmode.dtos.CategoriaDTO;
import com.example.sportmode.entities.Categoria;
import com.example.sportmode.services.CategoriaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/v1/categorias")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaServiceImpl,CategoriaDTO> {
}