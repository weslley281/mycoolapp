package com.__dev_tools_demo.__dev_tools_demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Olá Mundo!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Treino intenso ABCD";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        String[] fortunes = {
                "Hoje é o seu dia de sorte!",
                "Você encontrará uma surpresa agradável em breve.",
                "Algo bom está a caminho.",
                "Hoje talvez não seja o melhor dia... mas tudo passa.",
                "Tenha cautela com decisões importantes hoje."
        };

        int randomIndex = new Random().nextInt(fortunes.length);
        return fortunes[randomIndex];
    }
}
