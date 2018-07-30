package com.gx2.lojadecarrosapi.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import com.gx2.lojadecarrosapi.domain.ClienteNewDTO;
import com.gx2.lojadecarrosapi.entity.Cliente;
import com.gx2.lojadecarrosapi.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value="{id}")
    public Cliente find(@PathVariable("id") String id) {
        return this.clienteService.find(id);
    }

    @GetMapping(value = "{nome}")
    public Cliente findByNome(@PathVariable("nome") String nome) {
        return this.clienteService.findByNome(nome);
    }

    @GetMapping()
    public List<Cliente> list() {
        return this.clienteService.findAll();
    }

    @PostMapping()
    public ResponseEntity<Void> post(@Valid @RequestBody ClienteNewDTO clienteNew) {
        Cliente cliente = this.clienteService.fromDTO(clienteNew);
        cliente = this.clienteService.save(cliente);
        //Monta URI para retornar endereço do recurso após o POST
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}").buildAndExpand(cliente.id)
            .toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping()
    public Cliente put(@RequestBody Cliente cliente) {
        return this.clienteService.save(cliente);
    }
}