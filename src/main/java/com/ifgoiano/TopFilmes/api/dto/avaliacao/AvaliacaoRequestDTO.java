package com.ifgoiano.TopFilmes.api.dto.avaliacao;

import com.ifgoiano.TopFilmes.api.dto.filme.FilmeRequestDTO;
import com.ifgoiano.TopFilmes.api.dto.usuario.UsuarioRequestDTO;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoRequestDTO {

    @NotNull
    private int pontuacao;
    private Date dataHora = new Date();

    // Relacionamentos
    private UsuarioRequestDTO usuario;
    private FilmeRequestDTO filme;

}
