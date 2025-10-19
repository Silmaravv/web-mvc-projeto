package br.senac.tads.dsw.web_mvc;

import br.senac.tads.dsw.web_mvc.DadosService;
import br.senac.tads.dsw.web_mvc.DadosEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dados")
public class DadosController {

    @Autowired
    private DadosService service;

    // Página com a lista de registros
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("dados", service.findAll());
        return "lista"; // templates/lista.html
    }


    @GetMapping("/{id}")
    public String detalhes(@PathVariable Integer id, Model model) {
        DadosEntity dado = service.findById(id)
                .orElseThrow(() -> new RuntimeException("Registro não encontrado"));
        model.addAttribute("dado", dado);
        return "detalhe"; // templates/detalhe.html
    }

    // Exibe o formulário de novo cadastro
    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("dado", new DadosEntity());
        return "detalhe"; // reaproveita o mesmo formulário
    }

    // Salva novo cadastro (POST)
    @PostMapping
    public String salvar(@ModelAttribute DadosEntity dado) {
        service.save(dado);
        return "redirect:/dados"; // volta para a lista
    }

    // Excluir registro
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        service.deleteById(id);
        return "redirect:/dados";
    }
}
