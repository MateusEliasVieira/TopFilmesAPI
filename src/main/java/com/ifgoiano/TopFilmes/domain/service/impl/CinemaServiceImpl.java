package com.ifgoiano.TopFilmes.domain.service.impl;

import com.ifgoiano.TopFilmes.domain.domainException.RegrasDeNegocioException;
import com.ifgoiano.TopFilmes.domain.model.Cinema;
import com.ifgoiano.TopFilmes.domain.model.Sessao;
import com.ifgoiano.TopFilmes.domain.repository.CinemaRepository;
import com.ifgoiano.TopFilmes.domain.repository.SessaoRepository;
import com.ifgoiano.TopFilmes.domain.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CinemaServiceImpl implements CinemaService {

    @Autowired
    private CinemaRepository repository;
    @Autowired
    private SessaoRepository sessaoRepository;

    @Transactional(readOnly = false)
    @Override
    public Cinema salvarCinema(Cinema cinema) {
        Optional<Cinema> optionalCinema = repository.findByCnpj(cinema.getCnpj());
        if (optionalCinema.isEmpty()) {
            Cinema cinemaSalvo = repository.save(cinema);
            List<Sessao> listaDeSessao = new ArrayList<Sessao>();
            for (int i = 0; i < cinemaSalvo.getSessoes().size(); i++) {
                listaDeSessao.add(sessaoRepository.findById(cinema.getSessoes().get(i).getIdSessao()).orElseThrow(() -> new RegrasDeNegocioException("Não foi possível vincular uma sessão ao cinema, pois o id da sessão é inválido!")));
            }
            cinemaSalvo.setSessoes(listaDeSessao);
            return cinemaSalvo;
        } else {
            throw new RegrasDeNegocioException("O cinema com cnpj " + cinema.getCnpj() + " já está cadastrado em nosso sistema!");
        }
    }

    @Transactional(readOnly = false)
    @Override
    public Cinema atualizarCinema(Cinema cinema) {
        return repository.save(cinema);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Cinema> listarTodosCinemas() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Cinema buscarCinemaPorId(Long idCinema) {
        return repository.findById(idCinema).orElseThrow(() -> new RegrasDeNegocioException("Não existe cinema com id " + idCinema + "!"));
    }

    @Transactional(readOnly = false)
    @Override
    public void deletarCinemaPorId(Long idCinema) {
        try {
            buscarCinemaPorId(idCinema);
            repository.deleteById(idCinema);
        } catch (RegrasDeNegocioException regrasDeNegocioException) {
            throw new RegrasDeNegocioException("Não existe cinema com id " + idCinema + " para ser deletado!");
        }
    }

}
