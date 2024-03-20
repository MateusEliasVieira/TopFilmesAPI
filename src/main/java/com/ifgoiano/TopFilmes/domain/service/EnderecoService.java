package com.ifgoiano.TopFilmes.domain.service;


import com.ifgoiano.TopFilmes.domain.model.Endereco;

import java.util.List;

public interface EnderecoService {
    public Endereco salvarEndereco(Endereco endereco);

    public Endereco atualizarEndereco(Endereco endereco);

    public List<Endereco> listarTodosEnderecos();

    public Endereco buscarEnderecoPorId(Long idEndereco);

    public void deletarEnderecoPorId(Long idEndereco);
}
