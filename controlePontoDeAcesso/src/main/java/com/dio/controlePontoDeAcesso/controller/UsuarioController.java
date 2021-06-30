//package com.dio.controlePontoDeAcesso.controller;
//
//import com.dio.controlePontoDeAcesso.model.Usuario;
//import com.dio.controlePontoDeAcesso.service.UsuarioService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.crossstore.ChangeSetPersister;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/usuario")
//public class UsuarioController {
//    @Autowired
//    UsuarioService usuarioService;
//
//    @PostMapping
//    public Usuario createUsuario (@RequestBody Usuario usuario){
//        return usuarioService.createUsuario(usuario);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Usuario> findUsuario (@PathVariable long id) throws ChangeSetPersister.NotFoundException {
//        return ResponseEntity.ok(usuarioService.findUsuario(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException()));
//    }
//
//    @GetMapping
//    public List<Usuario> listaUsuario (){
//        return usuarioService.listaUsuario();
//    }
//
//    @PostMapping
//    public Usuario updateUsuario (@RequestBody Usuario usuario){
//        return usuarioService.updateUsuario(usuario);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Usuario> deleteUsuario (@PathVariable long id){
//        try {
//            usuarioService.deleteUsuario(id);
//        }catch (Exception e){
//            System.out.println(HttpStatus.NOT_FOUND);
//        }
//        return (ResponseEntity<Usuario>) ResponseEntity.ok();
//    }
//}
