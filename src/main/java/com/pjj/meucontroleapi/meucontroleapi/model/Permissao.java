package com.pjj.meucontroleapi.meucontroleapi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permissao")
public @Data class Permissao {

    @Id
    private Long id;
    private String descricao;
}
