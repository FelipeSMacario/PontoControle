package com.dio.controlePontoDeAcesso.repository;

import com.dio.controlePontoDeAcesso.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {
}
