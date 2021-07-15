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

}


