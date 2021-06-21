package br.com.sa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JardimController {
    @GetMapping("/jardim/jardim")
    public String jardim(){
        return "jardim/jardim";
    }
}
