package com.ifgoiano.TopFilmes.domain.repository;

import com.ifgoiano.TopFilmes.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Optional<Usuario> findByCpf(String cpf);
}
