package com.gx2.lojadecarrosapi.repository;

import com.gx2.lojadecarrosapi.entity.Veiculo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VeiculoRepository extends MongoRepository<Veiculo, String>{

    public Page<Veiculo> findByCategoriaNome(String nome, Pageable pages);
}