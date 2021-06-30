package com.dio.controlePontoDeAcesso.controller;

import com.dio.controlePontoDeAcesso.model.Movimentacao;
import com.dio.controlePontoDeAcesso.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao createMovimentacao (@RequestBody Movimentacao movimentacao){
        return movimentacaoService.createMovimentacao(movimentacao);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movimentacao> findMovimentacao (@PathVariable long id) throws ChangeSetPersister.NotFoundException {
        return ResponseEntity.ok(movimentacaoService.findMovimentacao(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException()));
    }

    @GetMapping
    public List<Movimentacao> listaMovimentacao (){
        return movimentacaoService.listaMovimentacao();
    }

    @PutMapping
    public Movimentacao updateMovimentacao (@RequestBody Movimentacao movimentacao){
        return movimentacaoService.updateMovimentacao(movimentacao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Movimentacao> deleteMovimentacao (@PathVariable long id){
        try{
            movimentacaoService.deleteMovimentacao(id);
        }catch (Exception e){
            System.out.println(HttpStatus.NOT_FOUND);
        }
        return (ResponseEntity<Movimentacao>) ResponseEntity.ok();
    }
}
