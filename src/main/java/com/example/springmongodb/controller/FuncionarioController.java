package com.example.springmongodb.controller;


import com.example.springmongodb.model.Funcionario;
import com.example.springmongodb.service.FuncionarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    private FuncionarioService funcionarioService;

    public FuncionarioController (FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public List<Funcionario> obtertodos () {
        return this.funcionarioService.obterTodos();

    }

    @GetMapping("/{codigo}")
    public Funcionario obterPorCodigo (@PathVariable String codigo) {
        return this.funcionarioService.obterPorCodigo(codigo);

    }

    @PostMapping
    public Funcionario criar (@RequestBody Funcionario funcionario) {
            return this.funcionarioService.criar(funcionario);
    }

}
