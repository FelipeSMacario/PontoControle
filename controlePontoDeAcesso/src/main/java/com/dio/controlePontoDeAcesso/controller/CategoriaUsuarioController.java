package com.dio.controlePontoDeAcesso.controller;

import com.dio.controlePontoDeAcesso.model.CategoriaUsuario;
import com.dio.controlePontoDeAcesso.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping
    public CategoriaUsuario createCategoria(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaService.saveCategoria(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> allCategoria() {
        return categoriaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaUsuario> findCategoria(@PathVariable long id) throws Exception {
        return ResponseEntity.ok(categoriaService.findById(id).orElseThrow(() -> new Exception("Id não identificado")));
    }
    @PutMapping
    public CategoriaUsuario updateCategoria(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaService.uodateCategoria(categoriaUsuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CategoriaUsuario> deleteCategoria(@PathVariable long id) {
        try {
            categoriaService.deleteById(id);
        } catch (Exception e) {
            System.out.println(HttpStatus.NOT_FOUND);
        }

        return (ResponseEntity<CategoriaUsuario>) ResponseEntity.ok();

    }
}
