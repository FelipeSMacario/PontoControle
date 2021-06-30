package com.dio.controlePontoDeAcesso.service;

import com.dio.controlePontoDeAcesso.model.JornadaTrabalho;
import com.dio.controlePontoDeAcesso.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    @Autowired
    JornadaRepository jornadaRepository;


    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public Optional<JornadaTrabalho> findById(Long id) {
        return jornadaRepository.findById(id);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public void deleteJornada(Long id) {
        jornadaRepository.deleteById(id);
    }

}
