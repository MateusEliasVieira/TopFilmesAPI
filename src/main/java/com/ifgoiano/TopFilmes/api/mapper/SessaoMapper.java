package com.ifgoiano.TopFilmes.api.mapper;

import com.ifgoiano.TopFilmes.api.dto.sessao.SessaoRequestDTO;
import com.ifgoiano.TopFilmes.api.dto.sessao.SessaoResponseDTO;
import com.ifgoiano.TopFilmes.domain.model.Sessao;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class SessaoMapper {

    public static Sessao converterSessaoRequestDTOEmSessaoEntidade(SessaoRequestDTO sessaoRequestDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(sessaoRequestDTO, Sessao.class);
    }

    public static SessaoResponseDTO converterCinemaEntidadeEmCinemaResponseDTO(Sessao sessao) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(sessao, SessaoResponseDTO.class);
    }

    public static List<SessaoResponseDTO> converterListaDeSessaoEntidadeParaListaDeSessaoResponseDTO(List<Sessao> listaSessao) {
        ModelMapper modelMapper = new ModelMapper();
        return listaSessao.stream()
                .map(sessao -> modelMapper.map(sessao, SessaoResponseDTO.class))
                .collect(Collectors.toList());
    }


}
