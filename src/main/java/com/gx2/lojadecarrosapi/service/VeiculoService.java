package com.gx2.lojadecarrosapi.service;

import java.util.List;

import com.gx2.lojadecarrosapi.entity.Veiculo;
import com.gx2.lojadecarrosapi.repository.VeiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {
    
    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> findAll(){
        return this.veiculoRepository.findAll();
    }

    public Page<Veiculo> findByCategoria(int page, int count, String categoriaId) {
        return this.veiculoRepository.findByCategoriaId(categoriaId, PageRequest.of(page, count));
    }

    public Veiculo save(Veiculo veiculo){
        return this.veiculoRepository.save(veiculo);
    }
}