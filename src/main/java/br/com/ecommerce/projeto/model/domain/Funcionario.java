package br.com.ecommerce.projeto.model.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Funcionario extends Pessoa{
    private Integer matricula;
    private Integer tipo;
    private double salario;

    public Funcionario(){}

    public Funcionario(Integer matricula, String nome, String email, Integer tipo, Cidade cidade, double salario, Integer idade, LocalDate dataNascimento) {
        super(nome, email, cidade, idade, dataNascimento);
        this.matricula = matricula;
        this.tipo = tipo;
        this.salario = salario;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }



    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
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
