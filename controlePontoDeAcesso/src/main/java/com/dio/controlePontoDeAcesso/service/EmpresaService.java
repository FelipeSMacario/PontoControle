package com.dio.controlePontoDeAcesso.service;

import com.dio.controlePontoDeAcesso.model.Empresa;
import com.dio.controlePontoDeAcesso.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    public Empresa saveEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public Optional<Empresa> findEmpresa(long id) {
        return empresaRepository.findById(id);
    }

    public List<Empresa> listaEmpresa() {
        return empresaRepository.findAll();
    }

    public Empresa updateEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public void deleteEmpresa(long id) {
        empresaRepository.deleteById(id);
    }
}
