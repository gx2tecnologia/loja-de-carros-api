package com.gx2.lojadecarrosapi.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

//DTO para busca de clientes
@Getter 
@Setter
public class ClienteDTO {

    @NotEmpty(message="O perfil deve ser informado")
    private String perfil;
    @NotEmpty(message="O nome deve ser informado")
    private String nome;
    @Email(message="Email inválido")
    private String email;


}