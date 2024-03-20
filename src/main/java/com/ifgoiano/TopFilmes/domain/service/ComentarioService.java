package com.ifgoiano.TopFilmes.domain.service;


import com.ifgoiano.TopFilmes.domain.model.Comentario;

import java.util.List;

public interface ComentarioService {

    public Comentario comentarFilme(Comentario comentario);

    public List<Comentario> listarTodosComentarios();

    public Comentario buscarComentarioPorId(Long idComentario);

    public void deletarComentarioPorId(Long idComentario);
}
