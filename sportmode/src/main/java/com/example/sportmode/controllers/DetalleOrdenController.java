package com.example.sportmode.controllers;


import com.example.sportmode.entities.DetalleOrden;
import com.example.sportmode.services.DetalleOrdenServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/v1/detalleorden")
public class DetalleOrdenController extends BaseControllerImpl<DetalleOrden, DetalleOrdenServiceImpl> {
}