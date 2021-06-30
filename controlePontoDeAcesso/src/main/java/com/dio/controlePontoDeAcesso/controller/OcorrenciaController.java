package com.dio.controlePontoDeAcesso.controller;

import com.dio.controlePontoDeAcesso.model.Ocorrencia;
import com.dio.controlePontoDeAcesso.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

    @Autowired
    OcorrenciaService ocorrenciaService;

    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.saveOcorrencia(ocorrencia);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ocorrencia> findOcorrencia(@PathVariable long id) throws ChangeSetPersister.NotFoundException {
        return ResponseEntity.ok(ocorrenciaService.findOcorrencia(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException()));
    }

    @GetMapping
    public List<Ocorrencia> listaOcorrencia(){
        return ocorrenciaService.listaOcorrencia();
    }

    @PutMapping
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.updateOcorrencia(ocorrencia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Ocorrencia> deleteOcorrencia(@PathVariable long id){
        try{
            ocorrenciaService.deleteOcorrencia(id);
        }catch (Exception e){
            System.out.println(HttpStatus.NOT_FOUND);
        }
        return (ResponseEntity<Ocorrencia>) ResponseEntity.ok();
    }
}
