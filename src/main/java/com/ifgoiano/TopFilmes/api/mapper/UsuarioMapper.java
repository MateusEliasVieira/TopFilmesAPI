package com.ifgoiano.TopFilmes.api.mapper;

import com.ifgoiano.TopFilmes.api.dto.usuario.UsuarioComIDRequestDTO;
import com.ifgoiano.TopFilmes.api.dto.usuario.UsuarioRequestDTO;
import com.ifgoiano.TopFilmes.api.dto.usuario.UsuarioResponseDTO;
import com.ifgoiano.TopFilmes.domain.model.Usuario;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioMapper {

    public static Usuario converterUsuarioRequestDTOEmUsuarioEntidade(UsuarioRequestDTO usuarioRequestDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(usuarioRequestDTO, Usuario.class);
    }

    public static Usuario converterUsuarioComIDRequestDTOEmUsuarioEntidade(UsuarioComIDRequestDTO usuarioComIDRequestDTO){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(usuarioComIDRequestDTO, Usuario.class);
    }

    public static UsuarioResponseDTO converterUsuarioEntidadeParaUsuarioResponseDTO(Usuario usuario) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(usuario, UsuarioResponseDTO.class);
    }

    public static List<UsuarioResponseDTO> converterListaDeUsuariosEntidadeParaListaDeUsuarioResponseDTO(List<Usuario> listaUsuario) {
        ModelMapper modelMapper = new ModelMapper();
        return listaUsuario.stream()
                .map(usuario -> modelMapper.map(usuario, UsuarioResponseDTO.class))
                .collect(Collectors.toList());
    }
}
