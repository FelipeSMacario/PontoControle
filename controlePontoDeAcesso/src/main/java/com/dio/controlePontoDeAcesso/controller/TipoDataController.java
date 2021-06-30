package com.dio.controlePontoDeAcesso.controller;

import com.dio.controlePontoDeAcesso.model.TipoData;
import com.dio.controlePontoDeAcesso.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipodata")
public class TipoDataController {
    @Autowired
    TipoDataService tipoDataService;

    @PostMapping
    public TipoData createTipoData(@RequestBody TipoData tipoData) {
        return tipoDataService.createTipoData(tipoData);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoData> findTipoData(@PathVariable long id) throws ChangeSetPersister.NotFoundException {
        return ResponseEntity.ok(tipoDataService.findTipoData(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException()));
    }

    @GetMapping
    public List<TipoData> listaTipoData() {
        return tipoDataService.listaTipoData();
    }

    @PutMapping
    public TipoData updateTipoData(@RequestBody TipoData tipoData) {
        return tipoDataService.updateTipoData(tipoData);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TipoData> deleteTipoData(@PathVariable long id) {
        try {
            tipoDataService.deleteTipoData(id);
        } catch (Exception e) {
            System.out.println(HttpStatus.NOT_FOUND);
        }
        return (ResponseEntity<TipoData>) ResponseEntity.ok();
    }
}
