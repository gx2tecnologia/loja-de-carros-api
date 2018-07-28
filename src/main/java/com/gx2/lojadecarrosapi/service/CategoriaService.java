package com.gx2.lojadecarrosapi.service;

import java.util.List;

import com.gx2.lojadecarrosapi.entity.Categoria;
import com.gx2.lojadecarrosapi.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll(){
        return this.categoriaRepository.findAll();
    } 

    public Categoria save(Categoria categoria) {
        return this.save(categoria);
    }

    public List<Categoria> save(List<Categoria> categorias) {
        return this.save(categorias);
    }
}
