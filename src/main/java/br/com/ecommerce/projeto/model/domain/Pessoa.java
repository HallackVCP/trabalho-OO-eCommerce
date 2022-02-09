package br.com.ecommerce.projeto.model.domain;

import java.time.LocalDate;

public abstract class Pessoa {
    private String nome;
    private String email;
    private Cidade cidade;


    public Pessoa(){}

    public Pessoa(String nome, String email, Cidade cidade){
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

}
