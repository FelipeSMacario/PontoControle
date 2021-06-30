package com.dio.controlePontoDeAcesso.service;

import com.dio.controlePontoDeAcesso.model.Calendario;
import com.dio.controlePontoDeAcesso.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {
    @Autowired
    CalendarioRepository calendarioRepository;

    public Calendario createCalendario(Calendario calendario) {
        return calendarioRepository.save(calendario);
    }

    public Optional<Calendario> findCalendario(long id) {
        return calendarioRepository.findById(id);
    }

    public List<Calendario> listaCalendario() {
        return calendarioRepository.findAll();
    }

    public Calendario update(Calendario calendario) {
        return calendarioRepository.save(calendario);
    }

    public void deleteCalendario(long id) {
        calendarioRepository.deleteById(id);
    }
}
