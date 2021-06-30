package com.dio.controlePontoDeAcesso.repository;

import com.dio.controlePontoDeAcesso.model.BancoHoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {
}
