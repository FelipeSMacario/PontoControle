package com.dio.controlePontoDeAcesso.service;

import com.dio.controlePontoDeAcesso.model.Ocorrencia;
import com.dio.controlePontoDeAcesso.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OcorrenciaService {
    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    public Ocorrencia saveOcorrencia(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }


    public Optional<Ocorrencia> findOcorrencia(long id) {
        return ocorrenciaRepository.findById(id);
    }

    public List<Ocorrencia> listaOcorrencia() {
        return ocorrenciaRepository.findAll();
    }

    public Ocorrencia updateOcorrencia(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }

    public void deleteOcorrencia(long id) {
        ocorrenciaRepository.deleteById(id);
    }
}
