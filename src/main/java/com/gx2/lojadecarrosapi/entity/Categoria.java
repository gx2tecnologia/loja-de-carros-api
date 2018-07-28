package com.gx2.lojadecarrosapi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Categoria{
    @Id
    public String id;
    public String descricao;
    public String nome;
}