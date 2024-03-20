package com.ifgoiano.TopFilmes.api.mapper;

import com.ifgoiano.TopFilmes.api.dto.cinema.CinemaRequestDTO;
import com.ifgoiano.TopFilmes.api.dto.cinema.CinemaResponseDTO;
import com.ifgoiano.TopFilmes.domain.model.Cinema;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class CinemaMapper {

    public static Cinema converterCinemaRequestDTOEmCinemaEntidade(CinemaRequestDTO cinemaRequestDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(cinemaRequestDTO, Cinema.class);
    }

    public static CinemaResponseDTO converterCinemaEntidadeEmCinemaResponseDTO(Cinema cinema) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(cinema, CinemaResponseDTO.class);
    }

    public static List<CinemaResponseDTO> converterListaDeCinemaEntidadeParaListaDeCinemaResponseDTO(List<Cinema> listaCinema) {
        ModelMapper modelMapper = new ModelMapper();
        return listaCinema.stream()
                .map(cinema -> modelMapper.map(cinema, CinemaResponseDTO.class))
                .collect(Collectors.toList());
    }
}
