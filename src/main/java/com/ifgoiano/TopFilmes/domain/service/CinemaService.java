package com.ifgoiano.TopFilmes.domain.service;


import com.ifgoiano.TopFilmes.domain.model.Cinema;

import java.util.List;

public interface CinemaService {
    public Cinema salvarCinema(Cinema cinema);

    public Cinema atualizarCinema(Cinema cinema);

    public List<Cinema> listarTodosCinemas();

    public Cinema buscarCinemaPorId(Long idCinema);

    public void deletarCinemaPorId(Long idCinema);
}
