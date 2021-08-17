package com.cenfotec.componentes.pruebabd.controller;


import com.cenfotec.componentes.pruebabd.domain.Game;
import com.cenfotec.componentes.pruebabd.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE})
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping("/games")
    public Flux<Game> getAllGames() {
        return service.findAll();
    }

    @GetMapping("/games/{id}")
    public Mono<Game> getGameById(@PathVariable(value = "id") String gameId) {
        return service.findById(gameId);
    }

    @GetMapping("/games/user/{personId}")
    public Flux<Game> getAllGamesByUser(@PathVariable(value = "personId") String personId) {
        return service.getAllGamesByUsers(personId);
    }

    @GetMapping("/games/category/{categoryName}")
    public Flux<Game> getAllGamesByCategory(@PathVariable(value = "categoryName") String categoryName) {
        return service.getAllGamesByCategory(categoryName);
    }

    @GetMapping("/games/platform/{platformName}")
    public Flux<Game> getAllGamesByPlatform(@PathVariable(value = "platformName") String platformName) {
        return service.getAllGamesByPlatform(platformName);
    }

    @PostMapping(value = "/games/saveGame")
    public Mono<Game> createNewGame(@RequestBody Game newGame) {
        final Mono<Game> insertedGameMono  = service.createNewGame(newGame);
        return insertedGameMono;
    }

    @DeleteMapping(value="/games/{id}")
    public Mono<Void> deleteGame(@PathVariable(value = "id") String gameId){
        return service.deleteGame(gameId);
    }
}
