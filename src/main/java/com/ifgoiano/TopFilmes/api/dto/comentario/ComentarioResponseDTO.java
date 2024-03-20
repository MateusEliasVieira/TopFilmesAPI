package com.ifgoiano.TopFilmes.api.dto.comentario;

import com.ifgoiano.TopFilmes.api.dto.usuario.UsuarioResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComentarioResponseDTO {

    private Long idComentario;
    private String texto;
    private Date dataHora;

    // Relacionamento
    private UsuarioResponseDTO usuario;

}
