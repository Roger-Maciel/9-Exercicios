package maciel.roger.campeaomysql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    @author Roger Maciel
    @since 27/04/2020
    @version 1.0
 */
@RestController
public class HelloGuysController {

    @GetMapping
    public String index() {
        return "Eae guys bora pro game ?";
    }
}
