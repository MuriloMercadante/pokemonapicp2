package br.com.fiap.checkpointacpart01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pokemon")
public class PokemonController {
    @GetMapping()
    public String pokemon() {
        return "Charmander, Bulbassauro, Squirtle";
    }

    @GetMapping("tipos")
    public String tipos() {
        return "Fogo, Planta, Água";
    }
}
