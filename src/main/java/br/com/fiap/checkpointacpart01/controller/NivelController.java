package br.com.fiap.checkpointacpart01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NivelController {
    @GetMapping("nivel")
    public String nivel() {
        return "Charmander: 3 - Bulbassauro: 3 - Squirtle - 5";
    }
}
