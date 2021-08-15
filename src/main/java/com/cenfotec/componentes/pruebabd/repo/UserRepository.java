package com.cenfotec.componentes.pruebabd.repo;

import com.azure.spring.data.cosmos.repository.Query;
import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.cenfotec.componentes.pruebabd.domain.Game;
import com.cenfotec.componentes.pruebabd.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveCosmosRepository<User, String> {


}
