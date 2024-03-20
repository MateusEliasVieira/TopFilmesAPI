package com.ifgoiano.TopFilmes.api.mapper;

import com.ifgoiano.TopFilmes.api.dto.lista.ListaRequestDTO;
import com.ifgoiano.TopFilmes.api.dto.lista.ListaResponseDTO;
import com.ifgoiano.TopFilmes.domain.model.Lista;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ListaMapper {

    public static Lista converterListaRequestDTOEmListaEntidade(ListaRequestDTO listaRequestDTO){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(listaRequestDTO, Lista.class);
    }

    public static ListaResponseDTO converterListaEntidadeEmListaResponseDTO(Lista lista){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(lista, ListaResponseDTO.class);
    }

    public static List<ListaResponseDTO> converterListaDeListaEntidadeParaListaDeListaResponseDTO(List<Lista> listaLista) {
        ModelMapper modelMapper = new ModelMapper();
        return listaLista.stream()
                .map(lista -> modelMapper.map(lista, ListaResponseDTO.class))
                .collect(Collectors.toList());
    }

}
