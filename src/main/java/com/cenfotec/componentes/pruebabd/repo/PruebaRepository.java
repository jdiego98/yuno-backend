package com.cenfotec.componentes.pruebabd.repo;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.cenfotec.componentes.pruebabd.domain.Prueba;
import org.springframework.stereotype.Repository;

@Repository
public interface PruebaRepository extends ReactiveCosmosRepository<Prueba, String> {


}
