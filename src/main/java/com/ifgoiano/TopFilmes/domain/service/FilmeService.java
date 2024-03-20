package com.ifgoiano.TopFilmes.domain.service;


import com.ifgoiano.TopFilmes.domain.model.Filme;

import java.util.List;

public interface FilmeService {

    public Filme adicionarNovoFilme(Filme filme);
    public void deletarFilmePorId(Long idFilme);

    public List<Filme> listarTodosFilmes();

}
