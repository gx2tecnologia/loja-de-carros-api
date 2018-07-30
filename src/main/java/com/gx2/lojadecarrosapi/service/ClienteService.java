package com.gx2.lojadecarrosapi.service;

import java.util.List;

import com.gx2.lojadecarrosapi.domain.ClienteNewDTO;
import com.gx2.lojadecarrosapi.entity.Cliente;
import com.gx2.lojadecarrosapi.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente find(String id) {
        return this.find(id);
    }

    public Cliente findByNome(String nome) {
        return this.clienteRepository.findByNome(nome);
    }

    public List<Cliente> findAll() {
        return this.clienteRepository.findAll();
    }

    public Cliente save(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    public Cliente fromDTO(ClienteNewDTO clienteNew){
        return new Cliente(
            clienteNew.perfil,
            clienteNew.nome,
            clienteNew.email,
            clienteNew.password           
        );
    }
}