package com.example.sportmode.controllers.controllerRest;

import com.example.sportmode.dtos.DetalleFacturaDTO;
import com.example.sportmode.entities.DetalleFactura;
import com.example.sportmode.services.DetalleFacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/v1/detallefacturas")
public class DetalleFacturaController extends BaseControllerImpl<DetalleFactura, DetalleFacturaServiceImpl, DetalleFacturaDTO> {
}