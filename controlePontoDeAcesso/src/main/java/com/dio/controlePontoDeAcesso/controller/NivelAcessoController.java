package com.dio.controlePontoDeAcesso.controller;

import com.dio.controlePontoDeAcesso.model.NivelAcesso;
import com.dio.controlePontoDeAcesso.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nivelacesso")
public class NivelAcessoController {
    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.createNivelAcesso(nivelAcesso);
    }

    @GetMapping("/{id}")
    public ResponseEntity<NivelAcesso> findNivelAcesso(@PathVariable long id) throws ChangeSetPersister.NotFoundException {
        return ResponseEntity.ok(nivelAcessoService.findNivelAcesso(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException()));
    }

    @GetMapping
    public List<NivelAcesso> listaNivelAcesso() {
        return nivelAcessoService.listaNivelAcesso();
    }

    @PutMapping
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.updateNivelAcesso(nivelAcesso);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<NivelAcesso> deleteNivelAcesso(@PathVariable long id) {
        try {
            nivelAcessoService.deleteNivelAcesso(id);
        } catch (Exception e) {
            System.out.println(HttpStatus.NOT_FOUND);
        }
        return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();
    }
}
