package com.dio.controlePontoDeAcesso.repository;

import com.dio.controlePontoDeAcesso.model.CategoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaUsuario, Long> {
}
