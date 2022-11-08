package com.example.sportmode.controllers.controllerRest;

import com.example.sportmode.dtos.ProductoDTO;
import com.example.sportmode.entities.Producto;
import com.example.sportmode.services.ProductoServiceImpl;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/v1/productos")
public class ProductoController extends BaseControllerImpl<Producto, ProductoServiceImpl, ProductoDTO> {






    }

