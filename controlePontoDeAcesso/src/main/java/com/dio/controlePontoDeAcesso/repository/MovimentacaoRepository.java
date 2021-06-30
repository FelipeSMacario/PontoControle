package com.dio.controlePontoDeAcesso.repository;

import com.dio.controlePontoDeAcesso.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}
