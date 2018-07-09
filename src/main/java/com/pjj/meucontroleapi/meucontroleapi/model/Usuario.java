package com.pjj.meucontroleapi.meucontroleapi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public @Data class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_permissao", joinColumns = @JoinColumn(name="id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_premissao"))
    private List<Permissao> permissoes;
}
