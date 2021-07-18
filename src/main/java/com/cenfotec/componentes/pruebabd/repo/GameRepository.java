package com.cenfotec.componentes.pruebabd.repo;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.cenfotec.componentes.pruebabd.domain.Game;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends ReactiveCosmosRepository<Game, String> {


}
