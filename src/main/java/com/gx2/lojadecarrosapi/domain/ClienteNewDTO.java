package com.gx2.lojadecarrosapi.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

//DTO para inserção de clientes
@Getter 
@Setter
public class ClienteNewDTO {

    @NotEmpty(message="O perfil deve ser informado")
    public String perfil;

    @NotEmpty(message="O nome deve ser informado")
    public String nome;

    @Email(message="Email inválido")
    public String email;

    @NotEmpty(message="A senha deve ser informado")
    @Length(min=5, max=20, message= "A senha deve ter ao menos 5 caracteres e no máximo 20 caracteres")
    public String password;

    ClienteNewDTO(){

    }

}