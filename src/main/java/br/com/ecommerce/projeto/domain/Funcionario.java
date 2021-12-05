package br.com.ecommerce.projeto.domain;

import java.util.Objects;

public class Funcionario {
    private Integer matricula;
    private String nome;
    private String email;
    private Integer tipo;
    private Cidade cidade;
    private double salario;

    public Funcionario(){}

    public Funcionario(Integer matricula, String nome, String email, Integer tipo, Cidade cidade, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
        this.cidade = cidade;
        this.salario = salario;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
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

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return matricula.equals(that.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
