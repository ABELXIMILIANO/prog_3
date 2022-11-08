package com.example.sportmode.controllers.controllerRest;

import com.example.sportmode.dtos.FacturaDTO;
import com.example.sportmode.entities.Factura;
import com.example.sportmode.services.FacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/v1/facturas")
public class FacturaController extends BaseControllerImpl<Factura, FacturaServiceImpl, FacturaDTO> {
}