package br.com.ecommerce.projeto.model.domain;

import java.time.LocalDate;

public abstract class Pessoa {
    private String nome;
    private String email;
    private Cidade cidade;
    private Integer idade;
    private LocalDate dataNascimento;

    public Pessoa(){}

    public Pessoa(String nome, String email, Cidade cidade, Integer Idade, LocalDate dataNascimento){
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
        this.idade= idade;
        this.dataNascimento = dataNascimento;
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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
