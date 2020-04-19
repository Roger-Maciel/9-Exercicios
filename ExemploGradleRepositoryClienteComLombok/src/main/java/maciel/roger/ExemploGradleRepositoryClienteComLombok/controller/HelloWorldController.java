package maciel.roger.ExemploGradleRepositoryClienteComLombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    @author Roger Maciel
    @since 16/04/2020
    @version 1.0
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Vai Toma em !!!!";
    }

}

