package com.gx2.lojadecarrosapi.repository;

import com.gx2.lojadecarrosapi.entity.Cliente;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
    
    public Cliente findByNome(String nome);
}