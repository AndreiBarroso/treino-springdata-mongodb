package com.example.springmongodb.service;



import com.example.springmongodb.model.Funcionario;

import java.util.List;

public interface FuncionarioService {

    public List<Funcionario> obterTodos ();
    public Funcionario obterPorCodigo(String codigo);
    public Funcionario criar (Funcionario funcionario);
    public List<Funcionario>  obterFuncionarioPorIdade(Integer  de, Integer ate);


}
