package com.gx2.lojadecarrosapi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Veiculo {
    
    @Id
    public String id;
    public String marca;
    public String modelo;
    public int ano;
    public String imagemUrl;
    public double valor;
    public int unidadesEmEstoque;
    @DBRef
    public Categoria categoria;
}
