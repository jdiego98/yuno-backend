package com.cenfotec.componentes.pruebabd.controller;


import com.cenfotec.componentes.pruebabd.domain.Game;
import com.cenfotec.componentes.pruebabd.domain.Prueba;
import com.cenfotec.componentes.pruebabd.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

@Controller
public class GameController {

    @Autowired
    GameService gameService;

// Probar con RestController

    @GetMapping("/game")
    public Flux<Game> getAllGames() {
        return gameService.findAll();
    }

}
