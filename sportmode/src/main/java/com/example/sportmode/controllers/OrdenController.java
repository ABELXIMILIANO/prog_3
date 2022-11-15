package com.example.sportmode.controllers;

import com.example.sportmode.entities.Orden;
import com.example.sportmode.services.OrdenServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/v1/orden")
public class OrdenController extends BaseControllerImpl<Orden, OrdenServiceImpl> {
}