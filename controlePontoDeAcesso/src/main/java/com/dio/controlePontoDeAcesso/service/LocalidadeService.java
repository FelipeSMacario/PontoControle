package com.dio.controlePontoDeAcesso.service;

import com.dio.controlePontoDeAcesso.model.Localidade;
import com.dio.controlePontoDeAcesso.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {
    @Autowired
    LocalidadeRepository localidadeRepository;

    public Localidade createLocalidade(Localidade localidade) {
        return localidadeRepository.save(localidade);
    }

    public Optional<Localidade> findLocalidade(long id) {
        return localidadeRepository.findById(id);
    }

    public List<Localidade> listaLolidade() {
        return localidadeRepository.findAll();
    }

    public Localidade updateLocalidade(Localidade localidade) {
        return localidadeRepository.save(localidade);
    }

    public void deleteLocalidade(long id) {
        localidadeRepository.deleteById(id);
    }
}
