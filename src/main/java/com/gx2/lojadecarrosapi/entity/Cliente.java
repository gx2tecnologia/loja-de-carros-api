package com.gx2.lojadecarrosapi.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Document
public class Cliente {

	@Id
    public String id;
    public String perfil;
    public String nome;
    public String email;
    @JsonIgnore
    public String password;

    //Não sei pq, mas o lombok não ta rolando nesse proj, dexei os atributos públicos mesmo como tavam =)
    public Cliente(String perfil, String nome, String email, String password) {
        this.perfil = perfil;
        this.nome = nome;
        this.email = email;
        this.password = password;    
    
    }



}
