package com.ifgoiano.TopFilmes.api.mapper;

import com.ifgoiano.TopFilmes.api.dto.avaliacao.AvaliacaoRequestDTO;
import com.ifgoiano.TopFilmes.api.dto.avaliacao.AvaliacaoResponseDTO;
import com.ifgoiano.TopFilmes.domain.model.Avaliacao;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class AvaliacaoMapper {

    public static Avaliacao converterAvaliacaoRequestDTOEmAvaliacaoEntidade(AvaliacaoRequestDTO avaliacaoRequestDTO){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(avaliacaoRequestDTO, Avaliacao.class);
    }

    public static AvaliacaoResponseDTO converterAvaliacaoEntidadeEmAvaliacaoResponseDTO(Avaliacao avaliacao){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(avaliacao, AvaliacaoResponseDTO.class);
    }

    public static List<AvaliacaoResponseDTO> converterListaDeAvaliacaoEntidadeParaListaDeAvaliacaoResponseDTO(List<Avaliacao> listaAvaliacao) {
        ModelMapper modelMapper = new ModelMapper();
        return listaAvaliacao.stream()
                .map(avaliacao -> modelMapper.map(avaliacao, AvaliacaoResponseDTO.class))
                .collect(Collectors.toList());
    }
    
    

}
