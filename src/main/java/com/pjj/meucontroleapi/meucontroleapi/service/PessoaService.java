package com.pjj.meucontroleapi.meucontroleapi.service;

import com.pjj.meucontroleapi.meucontroleapi.model.Pessoa;
import com.pjj.meucontroleapi.meucontroleapi.repository.PessoaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa atualizar(Long id, Pessoa pessoa) {
        Optional<Pessoa> pessoaSalva = buscarPessoaPeloId(id);
        BeanUtils.copyProperties(pessoa, pessoaSalva, "id");
        return pessoaRepository.save(pessoaSalva.get());
    }

    public void atualizarPropriedadeAtivo(Long id, Boolean ativo) {
        Optional<Pessoa> pessoaSalva = buscarPessoaPeloId(id);
        pessoaSalva.get().setAtivo(ativo);
        pessoaRepository.save(pessoaSalva.get());
    }

    public Optional<Pessoa> buscarPessoaPeloId(Long id) {
        Optional<Pessoa> pessoaSalva = pessoaRepository.findById(id);
        if (!pessoaSalva.isPresent())
            throw new EmptyResultDataAccessException(1);
        return pessoaSalva;
    }

}
