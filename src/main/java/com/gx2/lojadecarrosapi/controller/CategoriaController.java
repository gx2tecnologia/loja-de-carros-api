package com.gx2.lojadecarrosapi.controller;

import java.util.List;

import com.gx2.lojadecarrosapi.entity.Categoria;
import com.gx2.lojadecarrosapi.service.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> list() {
        return this.categoriaService.findAll();
    }

    @PostMapping
    public Categoria post(@RequestBody Categoria categoria) {
        return this.categoriaService.save(categoria);
    }
}
