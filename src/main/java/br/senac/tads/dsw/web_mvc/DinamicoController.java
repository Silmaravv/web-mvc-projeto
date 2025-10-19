package br.senac.tads.dsw.web_mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/dinamico")
public class DinamicoController {

    @GetMapping
    public String verTela(Model model) {
        String mensagem = "Conteúdo vindo do controller (dinâmico)";
        List<String> nomes = Arrays.asList("Fulana", "Ciclano","Beltrana");
        model.addAttribute("mensagem",mensagem);
        model.addAttribute("nomes",nomes);
        return "modelo";
    }

}
