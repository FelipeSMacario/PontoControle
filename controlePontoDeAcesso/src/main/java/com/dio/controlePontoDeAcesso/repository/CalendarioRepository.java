package com.dio.controlePontoDeAcesso.repository;

import com.dio.controlePontoDeAcesso.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
}
