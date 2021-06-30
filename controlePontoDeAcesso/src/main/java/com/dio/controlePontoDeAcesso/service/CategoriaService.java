package com.dio.controlePontoDeAcesso.service;

import com.dio.controlePontoDeAcesso.model.CategoriaUsuario;
import com.dio.controlePontoDeAcesso.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public CategoriaUsuario saveCategoria(CategoriaUsuario categoriaUsuario) {
        return categoriaRepository.save(categoriaUsuario);
    }

    public List<CategoriaUsuario> findAll() {
        return categoriaRepository.findAll();
    }

    public Optional<CategoriaUsuario> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    public CategoriaUsuario uodateCategoria(CategoriaUsuario categoriaUsuario) {
        return categoriaRepository.save(categoriaUsuario);
    }

    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }
}
