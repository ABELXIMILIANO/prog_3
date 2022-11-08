package com.example.sportmode.controllers;


import com.example.sportmode.dtos.CategoriaDTO;
import com.example.sportmode.dtos.ProductoDTO;
import com.example.sportmode.entities.Producto;
import com.example.sportmode.services.BaseServiceImpl;
import com.example.sportmode.services.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@CrossOrigin("*")
public class InicioController {

    @Autowired
    ProductoServiceImpl productoService;

    @GetMapping("/inicio")
    public String inicio(Model model){
        try {
            List<ProductoDTO> productos=this.productoService.findAll();
            model.addAttribute("productos",productos);

            return "views/inicio";
        }catch (Exception e){
            return "";
        }
    }
}
