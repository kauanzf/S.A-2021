package br.com.sa.controller;

import br.com.sa.model.Comentario;
import br.com.sa.service.ComentarioService;
import br.com.sa.service.ComentarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    @Autowired
    ComentarioServiceImpl comentarioService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("comentarios", comentarioService.findAll());
        System.out.println(comentarioService.findAll());
        return "index";
    }

    @GetMapping("/index/add")
    public String add(Model model){

        model.addAttribute("comentario", new Comentario());
        return "index/add";
    }

    @PostMapping("/index/save")
    public String save(Comentario comentario, Model model){

        if (comentarioService.save(comentario)){
            return "redirect:/";
        }else{
            //model.addAttribute("comentario", comentario);
            return "redirect:/";
        }
    }
}
