package com.atl_Academy.boocamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hola")
    public String primeraPrueba() {
        return "Hola como estas!";
    }
}
