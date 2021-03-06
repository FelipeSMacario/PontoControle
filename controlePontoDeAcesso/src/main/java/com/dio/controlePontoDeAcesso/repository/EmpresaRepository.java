package com.dio.controlePontoDeAcesso.repository;

import com.dio.controlePontoDeAcesso.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
