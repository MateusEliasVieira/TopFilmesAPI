package com.ifgoiano.TopFilmes.domain.repository;

import com.ifgoiano.TopFilmes.domain.model.Ator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository extends JpaRepository<Ator, Long> {
}
