package com.pjj.meucontroleapi.meucontroleapi.repository;

import com.pjj.meucontroleapi.meucontroleapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findByEmail(String email);
}
