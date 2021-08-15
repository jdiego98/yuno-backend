package com.cenfotec.componentes.pruebabd.repo;

import com.azure.spring.data.cosmos.repository.Query;
import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.cenfotec.componentes.pruebabd.domain.Game;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface GameRepository extends ReactiveCosmosRepository<Game, String> {

    @Query(value = "SELECT * FROM Games g WHERE g.personId = @personId")
    Flux<Game> getAllGamesByUsers(@Param("personId") String personId);

    @Query(value = "SELECT g.id FROM Games g JOIN category IN g.categories WHERE category.name = @categoryName")
    Flux<Game> getAllGamesByCategory(@Param("categoryName") String categoryName);

    @Query(value = "SELECT g.id FROM Games g JOIN platform IN g.platforms WHERE platform.name = @platformName")
    Flux<Game> getAllGamesByPlatform(@Param("platformName") String platformName);

    @Query(value = "SELECT top 1 g.id FROM Games g order by g._ts desc")
    Mono<Game> getLatsInsertedGameId();
}
