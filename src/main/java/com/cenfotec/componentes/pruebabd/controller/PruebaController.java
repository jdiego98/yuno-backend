package com.cenfotec.componentes.pruebabd.controller;

import com.cenfotec.componentes.pruebabd.domain.Prueba;
import com.cenfotec.componentes.pruebabd.services.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class PruebaController {

    @Autowired
    PruebaService pruebaService;


    @GetMapping("/prueba")
    public Flux<Prueba> getAllPruebas() {
        return pruebaService.findAll();
    }


    @PostMapping(
            value = "/prueba", consumes = "application/json", produces = "application/json")
    public void createPrueba(@RequestBody Prueba prueba) {
         pruebaService.addPrueba(prueba);
    }





}
