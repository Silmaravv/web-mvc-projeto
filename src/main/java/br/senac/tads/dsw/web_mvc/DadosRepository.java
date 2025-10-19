package br.senac.tads.dsw.web_mvc;

import br.senac.tads.dsw.web_mvc.DadosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadosRepository extends JpaRepository<DadosEntity, Integer> {
}