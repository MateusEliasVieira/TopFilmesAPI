package com.ifgoiano.TopFilmes.api.dto.usuario;

import com.ifgoiano.TopFilmes.api.dto.endereco.EnderecoResponseDTO;
import com.ifgoiano.TopFilmes.api.dto.lista.ListaResponseDTO;
import com.ifgoiano.TopFilmes.domain.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioResponseDTO {

    private Long idUsuario;
    private String nome;
    private String email;
    private String usuario;
    private Date dataRegistro = new Date();
    private Date dataNascimento;
    private Roles role = Roles.ROLE_USER;

    // Relacionamentos
    private EnderecoResponseDTO endereco;
    private ListaResponseDTO lista;

}
