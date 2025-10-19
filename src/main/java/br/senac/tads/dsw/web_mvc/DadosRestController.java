package br.senac.tads.dsw.web_mvc;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/dados")
public class DadosRestController {

    @Autowired
    private DadosService service;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping
    public String findAll() {
        List<DadosDto> dados = service.findAll();
        try {
            return objectMapper.writeValueAsString(dados);
        } catch (JsonProcessingException ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Integer id) {
        Optional<DadosDto> optDados = service.findById(id);
        if (!optDados.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        try {
            return objectMapper.writeValueAsString(optDados.get());
        } catch (JsonProcessingException ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
