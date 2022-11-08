package com.example.sportmode.controllers.controllerRest;

import com.example.sportmode.services.CategoriaServiceImpl;
import com.example.sportmode.services.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin("*")
public class IndexController {
    @Autowired
    ProductoServiceImpl productoService;

    @GetMapping(value = "/")
    public String index( ){
    return "index";
}



}
