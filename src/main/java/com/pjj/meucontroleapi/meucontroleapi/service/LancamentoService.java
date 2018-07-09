package com.pjj.meucontroleapi.meucontroleapi.service;

import com.pjj.meucontroleapi.meucontroleapi.model.Lancamento;
import com.pjj.meucontroleapi.meucontroleapi.model.Pessoa;
import com.pjj.meucontroleapi.meucontroleapi.repository.LancamentoRepository;
import com.pjj.meucontroleapi.meucontroleapi.repository.PessoaRepository;
import com.pjj.meucontroleapi.meucontroleapi.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LancamentoService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public Lancamento salvar(Lancamento lancamento) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getId());
        if(!pessoa.isPresent() || pessoa.get().isInativo()){
            throw new PessoaInexistenteOuInativaException();
        }
        return lancamentoRepository.save(lancamento);
    }
}
