package com.dio.controlePontoDeAcesso.repository;

import com.dio.controlePontoDeAcesso.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}
