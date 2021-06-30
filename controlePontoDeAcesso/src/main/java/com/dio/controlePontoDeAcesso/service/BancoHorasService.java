package com.dio.controlePontoDeAcesso.service;

import com.dio.controlePontoDeAcesso.model.BancoHoras;
import com.dio.controlePontoDeAcesso.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {
    @Autowired
    BancoHorasRepository bancoHorasRepository;

    public BancoHoras createBancoHoras(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    public Optional<BancoHoras> findBancoHoras(long id) {
        return bancoHorasRepository.findById(id);
    }

    public List<BancoHoras> listaBancoHoras() {
        return bancoHorasRepository.findAll();
    }

    public BancoHoras updateBancoHoras(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    public void deleteBancoHoras(long id) {
        bancoHorasRepository.deleteById(id);
    }
}
