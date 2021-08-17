package com.cenfotec.componentes.pruebabd.services;

import com.cenfotec.componentes.pruebabd.domain.Game;
import com.cenfotec.componentes.pruebabd.domain.Prueba;
import com.cenfotec.componentes.pruebabd.repo.GameRepository;
import com.cenfotec.componentes.pruebabd.repo.PruebaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public GameService(){

    }

    public Flux<Game> findAll(){
        return this.gameRepository.findAll();
    }

    public Mono<Game> findById(String gameId) {
        return this.gameRepository.findById(gameId);
    }

    public Flux<Game> getAllGamesByUsers(String personId){
        return this.gameRepository.getAllGamesByUsers(personId);
    }

    public Flux<Game> getAllGamesByCategory(String categoryName){
        return this.gameRepository.getAllGamesByCategory(categoryName);
    }

    public Flux<Game> getAllGamesByPlatform(String platformName){
        return this.gameRepository.getAllGamesByPlatform(platformName);
    }

    public Mono<Game> createNewGame(Game newGame) {
        final Mono<Game> lastInsertedId = this.gameRepository.getLatsInsertedGameId();
        final Game lastInsertedGame = lastInsertedId.block();
        String numberOnly= lastInsertedGame.getId().replaceAll("[^0-9]", "");
        int consutive = Integer.parseInt(numberOnly);

        consutive++;

        newGame.setId("game-" + consutive);
        newGame.setGameId("game-" + consutive);

        return this.gameRepository.save(newGame);
    }

    public Mono<Void> deleteGame(Game game){
        return this.gameRepository.delete(game);
    }
}


