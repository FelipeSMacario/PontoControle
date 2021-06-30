package com.dio.controlePontoDeAcesso.service;

import com.dio.controlePontoDeAcesso.model.Movimentacao;
import com.dio.controlePontoDeAcesso.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {
    @Autowired
    MovimentacaoRepository movimentacaoRepository;

    public Movimentacao createMovimentacao(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    public Optional<Movimentacao> findMovimentacao(long id) {
        return movimentacaoRepository.findById(id);
    }

    public List<Movimentacao> listaMovimentacao() {
        return movimentacaoRepository.findAll();
    }

    public Movimentacao updateMovimentacao(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    public void deleteMovimentacao(long id) {
        movimentacaoRepository.deleteById(id);
    }
}
