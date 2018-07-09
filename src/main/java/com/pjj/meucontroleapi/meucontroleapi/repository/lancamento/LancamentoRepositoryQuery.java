package com.pjj.meucontroleapi.meucontroleapi.repository.lancamento;

import com.pjj.meucontroleapi.meucontroleapi.model.Lancamento;
import com.pjj.meucontroleapi.meucontroleapi.repository.filter.LancamentoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LancamentoRepositoryQuery {
    public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
}
