package com.dio.controlePontoDeAcesso.controller;

import com.dio.controlePontoDeAcesso.model.BancoHoras;
import com.dio.controlePontoDeAcesso.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bancohoras")
public class BancoHorasController {
    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras createBancoHoras (@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.createBancoHoras(bancoHoras);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BancoHoras> findBancoHoras (@PathVariable long id) throws ChangeSetPersister.NotFoundException {
        return ResponseEntity.ok(bancoHorasService.findBancoHoras(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException()));
    }

    @GetMapping
    public List<BancoHoras> listaBancoHoras(){
        return bancoHorasService.listaBancoHoras();
    }

    @PutMapping
    public BancoHoras updateBancoHoras (@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.updateBancoHoras(bancoHoras);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BancoHoras> deleteBancoHoras (@PathVariable long id){
        try {
            bancoHorasService.deleteBancoHoras(id);
        }catch (Exception e){
            System.out.println(HttpStatus.NOT_FOUND);
        }
        return (ResponseEntity<BancoHoras>) ResponseEntity.ok();
    }
}
