package com.gx2.lojadecarrosapi.controller;

import java.util.List;

import com.gx2.lojadecarrosapi.entity.Veiculo;
import com.gx2.lojadecarrosapi.service.VeiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping(value = "{page}/{count}/{categoria}")
    public Page<Veiculo> findByCategoria(@PathVariable("page") int page, @PathVariable("count") int count,
            @PathVariable("categoria") String categoria) {
        return this.veiculoService.findByCategoria(page, count, categoria);
    }

    @PostMapping()
    public Veiculo post(@RequestBody Veiculo veiculo) {
        return this.veiculoService.save(veiculo);
    }

    @PutMapping()
    public Veiculo put(@RequestBody Veiculo veiculo) {
        return this.veiculoService.save(veiculo);
    }
}
