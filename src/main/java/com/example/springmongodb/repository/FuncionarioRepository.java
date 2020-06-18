package com.example.springmongodb.repository;

import com.example.springmongodb.model.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {


    @Query("{ $and:[{ 'idade': { $gte: ?0 } }, { 'idade': {$lte: ?1 } } ] }")
    public List<Funcionario>  obterFuncionarioPorIdade(Integer  de, Integer ate);

    public List<Funcionario> findByNome (String nome);


}
