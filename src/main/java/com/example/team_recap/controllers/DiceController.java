package com.example.team_recap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/roll-dice")
public class DiceController {

    @GetMapping
    public String site(){
        return "roll-dice";
    }

//    @GetMapping("/{n}")
//    public String diceRoll(@PathVariable byte n){
//
//    }
}
