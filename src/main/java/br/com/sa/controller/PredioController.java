package br.com.sa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PredioController {
    @GetMapping("/predio/predio")
    public String predio(){
        return "predio/predio";
    }


}
