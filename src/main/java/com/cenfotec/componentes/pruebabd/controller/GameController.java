package com.cenfotec.componentes.pruebabd.controller;


import com.cenfotec.componentes.pruebabd.domain.Game;
import com.cenfotec.componentes.pruebabd.repo.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class GameController {

    @Autowired
    private GameRepository repository;

    @GetMapping("/games")
    public Flux<Game> getAllGames() {
        final Flux<Game> findAllByFlux = repository.findAll();
        return findAllByFlux;
    }

    @GetMapping("/games/{id}")
    public Game getGameById(@PathVariable(value = "id") String gameId) {
        final Mono<Game> findByIdMono = repository.findById(gameId);
        return findByIdMono.block();
    }

    @GetMapping("/games/user/{personId}")
    public Flux<Game> getAllGamesByUser(@PathVariable(value = "personId") String personId) {
        final Flux<Game> findByUser = repository.getAllGamesByUsers(personId);
        return findByUser;
    }

    @GetMapping("/games/category/{categoryName}")
    public Flux<Game> getAllGamesByCategory(@PathVariable(value = "categoryName") String categoryName) {
        final Flux<Game> findByCategory = repository.getAllGamesByCategory(categoryName);
        return findByCategory;
    }

    @GetMapping("/games/platform/{platformName}")
    public Flux<Game> getAllGamesByPlatform(@PathVariable(value = "platformName") String platformName) {
        final Flux<Game> findByPlatform = repository.getAllGamesByPlatform(platformName);
        return findByPlatform;
    }
}
