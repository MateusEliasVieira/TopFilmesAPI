package com.ifgoiano.TopFilmes.domain.service;


import com.ifgoiano.TopFilmes.domain.model.Sessao;

import java.util.List;

public interface SessaoService {
    public Sessao salvarSessao(Sessao sessao);

    public Sessao atualizarSessao(Sessao sessao);

    public List<Sessao> listarTodasSessoes();

    public Sessao buscarSessaoPorId(Long idSessao);

    public void deletarSessaoPorId(Long idSessao);
}
