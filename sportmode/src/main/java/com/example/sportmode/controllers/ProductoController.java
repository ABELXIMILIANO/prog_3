package com.example.sportmode.controllers;

import com.example.sportmode.entities.Producto;
import com.example.sportmode.services.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/v1/productos")
public class ProductoController extends BaseControllerImpl<Producto, ProductoServiceImpl> {

    @Autowired
    private ProductoServiceImpl productoService;

    @GetMapping(value = "/busqueda")
    public String busquedaVideojuego(Model model, @RequestParam(value ="query",required = false)String q){
        try {
            List<Producto> videojuegos = this.productoService.findByName(q);
            model.addAttribute("productos", videojuegos);
            model.addAttribute("resultado",q);
            return "views/busqueda";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

}

