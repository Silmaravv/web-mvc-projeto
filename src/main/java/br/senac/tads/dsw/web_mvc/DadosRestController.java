package br.senac.tads.dsw.web_mvc;

import br.senac.tads.dsw.web_mvc.DadosEntity;
import br.senac.tads.dsw.web_mvc.DadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/dados")
public class DadosRestController {

    @Autowired
    private DadosService service;

    @GetMapping
    public List<DadosEntity> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public DadosEntity findById(@PathVariable Integer id) {
        return service.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DadosEntity create(@RequestBody @Valid DadosEntity dado) {
        return service.save(dado);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Integer id, @RequestBody @Valid DadosEntity dado) {
        if (!service.findById(id).isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        dado.setId(id);
        service.save(dado);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        if (!service.deleteById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/upload")
    @ResponseStatus(HttpStatus.CREATED)
    public DadosEntity createWithUpload(
            @Valid @ModelAttribute DadosEntity dado,
            @RequestParam(required = false) MultipartFile arquivo) {

        if (arquivo != null && !arquivo.isEmpty()) {
            dado.setNomeArquivo(arquivo.getOriginalFilename());
        }

        return service.save(dado);
    }
}