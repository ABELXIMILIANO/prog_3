package com.example.sportmode.controllers.controllerRest;

import com.example.sportmode.dtos.DomicilioDTO;
import com.example.sportmode.entities.Domicilio;
import com.example.sportmode.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl,DomicilioDTO> {
}
