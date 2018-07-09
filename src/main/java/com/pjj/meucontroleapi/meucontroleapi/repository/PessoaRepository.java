package com.pjj.meucontroleapi.meucontroleapi.repository;

import com.pjj.meucontroleapi.meucontroleapi.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
