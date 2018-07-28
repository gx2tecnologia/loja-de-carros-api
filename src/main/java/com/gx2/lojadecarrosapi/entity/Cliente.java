package com.gx2.lojadecarrosapi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Cliente {

    @Id
    public String id;
    public String perfil;
    public String nome;
    public String email;
    public String password;

}
