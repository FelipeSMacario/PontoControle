package com.dio.controlePontoDeAcesso.controller;

import com.dio.controlePontoDeAcesso.model.Localidade;
import com.dio.controlePontoDeAcesso.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {
    @Autowired
    LocalidadeService localidadeService;

    @PostMapping
    public Localidade createLocalidade(@RequestBody Localidade localidade) {
        return localidadeService.createLocalidade(localidade);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Localidade> findLocalidade(@PathVariable long id) throws ChangeSetPersister.NotFoundException {
        return ResponseEntity.ok(localidadeService.findLocalidade(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException()));
    }

    @GetMapping
    public List<Localidade> listaLocalidade() {
        return localidadeService.listaLolidade();
    }

    @PutMapping
    public Localidade updateLocalidade(@RequestBody Localidade localidade) {
        return localidadeService.updateLocalidade(localidade);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Localidade> deleteLocalidade(@PathVariable long id) {
        try {
            localidadeService.deleteLocalidade(id);
        } catch (Exception e) {
            System.out.println(HttpStatus.NOT_FOUND);
        }
        return (ResponseEntity<Localidade>) ResponseEntity.ok();
    }
}
