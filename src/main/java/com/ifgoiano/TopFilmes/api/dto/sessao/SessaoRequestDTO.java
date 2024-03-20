package com.ifgoiano.TopFilmes.api.dto.sessao;

import com.ifgoiano.TopFilmes.domain.model.Cinema;
import com.ifgoiano.TopFilmes.domain.model.Filme;
import jakarta.validation.constraints.NotNull;
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
public class SessaoRequestDTO {

    private Long idSessao;
    @NotNull
    private Date horario;
    @NotNull
    private int ingressos;
    @NotNull
    private int sala;
    @NotNull
    private int codSessao;

    // Relacionamentos

    private List<Filme> filmes;
    private List<Cinema> cinemas;
}
