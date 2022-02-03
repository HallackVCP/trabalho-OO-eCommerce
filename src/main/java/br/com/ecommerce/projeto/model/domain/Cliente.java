package br.com.ecommerce.projeto.model.domain;


import br.com.ecommerce.projeto.model.domain.enums.SexoCliente;
import br.com.ecommerce.projeto.model.domain.enums.TipoCliente;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente extends Pessoa{
    private String cpfOuCnpj;
    private Integer tipo;
    private SexoCliente sexo;


    public Cliente() {
    }
    public Cliente(String nome, String email, String cpfOuCnpj,
                   TipoCliente tipo, LocalDate dataNascimento, SexoCliente sexo, Integer idade, Cidade cidade) {
        super(nome, email, cidade, idade);
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipo = tipo.getCod();
        this.sexo = sexo;
    }
    public Cliente(String nome, String email, String cpfOuCnpj,
                   Integer tipo, LocalDate dataNascimento, SexoCliente sexo, Integer idade, Cidade cidade){
        super(nome, email, cidade, idade);
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipo = tipo;
        this.sexo = sexo;
    }



    public SexoCliente getSexo() {
        return sexo;
    }

    public void setSexo(SexoCliente sexo) {
        this.sexo = sexo;
    }



    public String getCpfOuCnpj() {
        return cpfOuCnpj;
    }

    public void setCpfOuCnpj(String cpfOuCnpj) {
        this.cpfOuCnpj = cpfOuCnpj;
    }

    public TipoCliente getTipo() {
        return TipoCliente.toEnum(tipo);
    }


    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo.getCod();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return cpfOuCnpj.equals(cliente.cpfOuCnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpfOuCnpj);
    }
}
