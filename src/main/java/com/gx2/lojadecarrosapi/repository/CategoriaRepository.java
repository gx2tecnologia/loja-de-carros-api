package com.gx2.lojadecarrosapi.repository;

import com.gx2.lojadecarrosapi.entity.Categoria;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoriaRepository extends MongoRepository<Categoria, String>{
    
}