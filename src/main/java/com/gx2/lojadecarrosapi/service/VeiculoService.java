package com.gx2.lojadecarrosapi.service;

import java.util.List;

import com.gx2.lojadecarrosapi.entity.Veiculo;
import com.gx2.lojadecarrosapi.repository.VeiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {
    
    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> findAll(){
        return this.veiculoRepository.findAll();
    }

    public Veiculo save(Veiculo veiculo){
        return this.veiculoRepository.save(veiculo);
    }
}