package com.dio.controlePontoDeAcesso.repository;

import com.dio.controlePontoDeAcesso.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData, Long> {
}
