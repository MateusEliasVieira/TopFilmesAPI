package com.ifgoiano.TopFilmes.domain.service.impl;

import com.ifgoiano.TopFilmes.domain.domainException.RegrasDeNegocioException;
import com.ifgoiano.TopFilmes.domain.model.Filme;
import com.ifgoiano.TopFilmes.domain.repository.FilmeRepository;
import com.ifgoiano.TopFilmes.domain.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FilmeServiceImpl implements FilmeService {

    @Autowired
    private FilmeRepository repository;

    @Transactional(readOnly = false)
    @Override
    public Filme adicionarNovoFilme(Filme filme) {
        // Verificar se o filme não está cadastrado
        if (repository.findFilmeByTitulo(filme.getTitulo()).isPresent()) {
            throw new RegrasDeNegocioException("O filme " + filme.getTitulo() + " já está cadastrado em nosso sistema!");
        } else {
            return repository.save(filme);
        }
    }

    @Transactional(readOnly = false)
    @Override
    public void deletarFilmePorId(Long idFilme) {
        repository.deleteById(idFilme);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Filme> listarTodosFilmes() {
        return repository.findAll();
    }

}
