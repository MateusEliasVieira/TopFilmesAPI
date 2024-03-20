package com.ifgoiano.TopFilmes.domain.repository;

import com.ifgoiano.TopFilmes.domain.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {

    @Query("SELECT a FROM Avaliacao a WHERE a.usuario.idUsuario = :usuario_id")
    public Optional<Avaliacao> findByUsuarioId(@Param("usuario_id") Long usuario_id);
}
