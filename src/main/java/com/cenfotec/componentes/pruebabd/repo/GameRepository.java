package com.cenfotec.componentes.pruebabd.repo;

import com.azure.spring.data.cosmos.repository.Query;
import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.cenfotec.componentes.pruebabd.domain.Game;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface GameRepository extends ReactiveCosmosRepository<Game, String> {

    @Query(value = "SELECT * FROM Games g WHERE g.personId = @personId")
    Flux<Game> getAllGamesByUsers(@Param("personId") String personId);
}
