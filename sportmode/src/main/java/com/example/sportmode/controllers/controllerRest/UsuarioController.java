package com.example.sportmode.controllers.controllerRest;

import com.example.sportmode.dtos.UsuarioDTO;
import com.example.sportmode.entities.Usuario;
import com.example.sportmode.services.UsuarioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/v1/usuarios")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl, UsuarioDTO> {
}
