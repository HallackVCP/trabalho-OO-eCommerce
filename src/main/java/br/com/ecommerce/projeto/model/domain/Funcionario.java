package br.com.ecommerce.projeto.model.domain;

import br.com.ecommerce.projeto.model.domain.enums.TipoFuncionario;

import java.time.LocalDate;
import java.util.Objects;

public class Funcionario extends Pessoa{
    private String matricula;
    private int tipo;
    private double salario;
    private TipoFuncionario type;

    public Funcionario(){}

    public Funcionario(String matricula, String nome, String email, Integer tipo,
                       Cidade cidade, double salario) {
        super(nome, email, cidade);
        this.matricula = matricula;
        this.tipo = tipo;
        this.type = TipoFuncionario.toEnum(tipo);
        this.salario = salario;
    }

    public Funcionario(String matricula, String nome, String email, TipoFuncionario tipo,
                       Cidade cidade, double salario) {
        super(nome, email, cidade);
        this.matricula = matricula;
        this.tipo = tipo.getCod();
        this.type = tipo;
        this.salario = salario;
    }



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    public TipoFuncionario getTipo() {

        return TipoFuncionario.toEnum(tipo);
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
