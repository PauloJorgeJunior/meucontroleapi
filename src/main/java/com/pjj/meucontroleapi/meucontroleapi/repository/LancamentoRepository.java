package com.pjj.meucontroleapi.meucontroleapi.repository;

import com.pjj.meucontroleapi.meucontroleapi.model.Lancamento;
import com.pjj.meucontroleapi.meucontroleapi.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
}
