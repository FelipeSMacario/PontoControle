package com.dio.controlePontoDeAcesso.service;

import com.dio.controlePontoDeAcesso.model.Usuario;
import com.dio.controlePontoDeAcesso.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> findUsuario(long id) {
        return usuarioRepository.findById(id);
    }

    public List<Usuario> listaUsuario() {
        return usuarioRepository.findAll();
    }

    public Usuario updateUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(long id) {
        usuarioRepository.deleteById(id);
    }
}
