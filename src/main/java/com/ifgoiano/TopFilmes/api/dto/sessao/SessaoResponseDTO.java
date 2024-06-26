package com.ifgoiano.TopFilmes.api.dto.sessao;

import com.ifgoiano.TopFilmes.domain.model.Filme;
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
public class SessaoResponseDTO {

    private Long idSessao;
    private Date horario;
    private int ingressos;
    private int sala;
    private int codSessao;

    // Relacionamentos
    private List<Filme> filmes;

}
