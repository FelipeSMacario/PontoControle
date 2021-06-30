package com.dio.controlePontoDeAcesso.controller;

import com.dio.controlePontoDeAcesso.model.Empresa;
import com.dio.controlePontoDeAcesso.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return empresaService.saveEmpresa(empresa);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> findEmpresa(@PathVariable long id) throws ChangeSetPersister.NotFoundException {
        return ResponseEntity.ok(empresaService.findEmpresa(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException()));
    }

    @GetMapping
    public List<Empresa> listaEmpresa() {
        return empresaService.listaEmpresa();
    }

    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa) {
        return empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Empresa> deleteEmpresa(@PathVariable long id) {
        try {
            empresaService.deleteEmpresa(id);
        } catch (Exception e) {
            System.out.println(HttpStatus.NOT_FOUND);
        }
        return (ResponseEntity<Empresa>) ResponseEntity.ok();
    }
}
