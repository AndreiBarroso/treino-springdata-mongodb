package com.example.springmongodb.service.impl;

import com.example.springmongodb.model.Funcionario;
import com.example.springmongodb.repository.FuncionarioRepository;
import com.example.springmongodb.service.FuncionarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioServiceImpl (FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Override
    public List<Funcionario> obterTodos() {
        return this.funcionarioRepository.findAll();
    }

    @Override
    public Funcionario obterPorCodigo(String codigo) {
        return this.funcionarioRepository
                .findById(codigo)
                .orElseThrow(() -> new IllegalArgumentException("Funcionario não existe"));
    }

    @Override
    public Funcionario criar(Funcionario funcionario) {
        return this.funcionarioRepository.save(funcionario);
    }
}
