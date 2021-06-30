package com.dio.controlePontoDeAcesso.controller;

import com.dio.controlePontoDeAcesso.model.Calendario;
import com.dio.controlePontoDeAcesso.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {
    @Autowired
    CalendarioService calendarioService;

    @PostMapping
    public Calendario createCalendario (@RequestBody Calendario calendario){
        return calendarioService.createCalendario(calendario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calendario> findCalendario (@PathVariable long id) throws ChangeSetPersister.NotFoundException {
        return ResponseEntity.ok(calendarioService.findCalendario(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException()));
    }

    @GetMapping
    public List<Calendario> listaCalendario (){
        return calendarioService.listaCalendario();
    }

    @PutMapping
    public Calendario updateCalendario (@RequestBody Calendario calendario){
        return calendarioService.update(calendario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Calendario> deleteCalendario (@PathVariable long id){
        try {
            calendarioService.deleteCalendario(id);
        }catch (Exception e){
            System.out.println(HttpStatus.NOT_FOUND);
        }
        return (ResponseEntity<Calendario>) ResponseEntity.ok();
    }
}
