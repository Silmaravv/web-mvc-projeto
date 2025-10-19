package br.senac.tads.dsw.web_mvc;

import br.senac.tads.dsw.web_mvc.DadosDto;
import br.senac.tads.dsw.web_mvc.DadosEntity;
import br.senac.tads.dsw.web_mvc.DadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DadosService {

    @Autowired
    private DadosRepository repository;

    public List<DadosEntity> findAll() {
        return repository.findAll();
    }

    public Optional<DadosEntity> findById(Integer id) {
        return repository.findById(id);
    }

    public DadosEntity save(DadosEntity dado) {
        return repository.save(dado);
    }

    public boolean deleteById(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}