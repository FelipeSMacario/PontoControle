package com.dio.controlePontoDeAcesso.controller;

import com.dio.controlePontoDeAcesso.model.JornadaTrabalho;
import com.dio.controlePontoDeAcesso.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable long id) throws Exception {
        return ResponseEntity.ok(jornadaService.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException()));
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaService.findAll();
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> deleteJornadaById(@PathVariable long id) throws Exception {
        try {
            jornadaService.deleteJornada(id);
        }catch (Exception e){
            System.out.println(HttpStatus.NOT_FOUND);
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }
}
