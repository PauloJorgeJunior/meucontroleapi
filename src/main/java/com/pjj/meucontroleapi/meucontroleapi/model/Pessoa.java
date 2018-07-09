package com.pjj.meucontroleapi.meucontroleapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pessoa")
public @Data class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 20)
    private String nome;

    @Embedded
    private Endereco endereco;

    @NotNull
    private boolean ativo;

    @JsonIgnore
    @Transient
    public boolean isInativo(){
        return !this.ativo;
    }
}
