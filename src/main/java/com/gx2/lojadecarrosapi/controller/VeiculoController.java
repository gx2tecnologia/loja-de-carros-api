package com.gx2.lojadecarrosapi.controller;

import java.util.List;

import com.gx2.lojadecarrosapi.entity.Veiculo;
import com.gx2.lojadecarrosapi.service.VeiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
    
    @Autowired
    private VeiculoService veiculoService;

    @GetMapping()
    public List<Veiculo> findAll() {
        return this.veiculoService.findAll();
    }

    @PostMapping()
    public Veiculo post(@RequestBody Veiculo veiculo) {
        return this.veiculoService.save(veiculo);
    }


}