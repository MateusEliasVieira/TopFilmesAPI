package com.ifgoiano.TopFilmes.api.dto.lista;

import com.ifgoiano.TopFilmes.api.dto.filme.FilmeRequestDTO;
import com.ifgoiano.TopFilmes.api.dto.usuario.UsuarioRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListaRequestDTO {

    private Date adicao = new Date();

    // Relacionamentos
    private UsuarioRequestDTO usuario;
    private List<FilmeRequestDTO> filmes;
}
