package com.example.springmongodb.repository;

import com.example.springmongodb.model.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
}
