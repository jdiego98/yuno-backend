package com.cenfotec.componentes.pruebabd.services;

import com.cenfotec.componentes.pruebabd.repo.PruebaRepository;
import com.cenfotec.componentes.pruebabd.domain.Prueba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class PruebaService {


    @Autowired
    PruebaRepository pruebaRepository;


    public PruebaService(){

    }

    public void addPrueba(Prueba testPrueba){

          final Mono<Prueba> savePruebaMono = pruebaRepository.save(testPrueba);
          final Prueba savedPrueba = savePruebaMono.block();

    }

    public Flux<Prueba>  findAll(){
        return this.pruebaRepository.findAll();
    }

    public Mono<Prueba> findById(String id){
        return  this.pruebaRepository.findById(id);
    }

//    public void updatePrueba(Prueba prueba){
//        return this.pruebaRepository.
//    }

}
