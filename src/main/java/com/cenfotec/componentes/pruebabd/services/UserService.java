package com.cenfotec.componentes.pruebabd.services;

import com.cenfotec.componentes.pruebabd.domain.Game;
import com.cenfotec.componentes.pruebabd.domain.User;
import com.cenfotec.componentes.pruebabd.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserService() {
    }

    public User verificar(User usuario){

        List<User> usuarios = this.userRepository.findAll().collectList().block();
        User res = new User();

        for(User u: usuarios){
            if(u.getUserName().equals(usuario.getUserName())
                    && u.getPassword().equals(usuario.getPassword())){
                res = u;
            }
        }
        return res;
    }

    public Flux<User> findAll(){
        return this.userRepository.findAll();
    }
}
