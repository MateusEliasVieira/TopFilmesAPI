package com.ifgoiano.TopFilmes.domain.repository;

import com.ifgoiano.TopFilmes.domain.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
