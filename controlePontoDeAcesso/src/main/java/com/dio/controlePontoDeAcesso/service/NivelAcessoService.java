package com.dio.controlePontoDeAcesso.service;

import com.dio.controlePontoDeAcesso.model.NivelAcesso;
import com.dio.controlePontoDeAcesso.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {
    @Autowired
    NivelAcessoRepository nivelAcessoRepository;

    public NivelAcesso createNivelAcesso(NivelAcesso nivelAcesso) {
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public Optional<NivelAcesso> findNivelAcesso(long id) {
        return nivelAcessoRepository.findById(id);
    }

    public List<NivelAcesso> listaNivelAcesso() {
        return nivelAcessoRepository.findAll();
    }

    public NivelAcesso updateNivelAcesso(NivelAcesso nivelAcesso) {
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public void deleteNivelAcesso(long id) {
        nivelAcessoRepository.deleteById(id);
    }
}
