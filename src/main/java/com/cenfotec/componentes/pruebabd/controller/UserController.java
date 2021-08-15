package com.cenfotec.componentes.pruebabd.controller;


import com.cenfotec.componentes.pruebabd.domain.Game;
import com.cenfotec.componentes.pruebabd.domain.User;
import com.cenfotec.componentes.pruebabd.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user")
    public User createNewGame(@RequestBody User user) {
        return this.userService.verificar(user);
    }

    @GetMapping("/user")
    public Flux<User> getAllGames() {
        return userService.findAll();
    }
}
