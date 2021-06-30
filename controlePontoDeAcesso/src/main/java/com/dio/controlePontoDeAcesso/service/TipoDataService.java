package com.dio.controlePontoDeAcesso.service;

import com.dio.controlePontoDeAcesso.model.TipoData;
import com.dio.controlePontoDeAcesso.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {
    @Autowired
    TipoDataRepository tipoDataRepository;

    public TipoData createTipoData(TipoData tipoData) {
        return tipoDataRepository.save(tipoData);
    }

    public Optional<TipoData> findTipoData(long id) {
        return tipoDataRepository.findById(id);
    }

    public List<TipoData> listaTipoData() {
        return tipoDataRepository.findAll();
    }

    public TipoData updateTipoData(TipoData tipoData) {
        return tipoDataRepository.save(tipoData);
    }

    public void deleteTipoData(long id) {
        tipoDataRepository.deleteById(id);
    }
}
