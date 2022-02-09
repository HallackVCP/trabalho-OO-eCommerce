package br.com.ecommerce.projeto.model.domain;


import br.com.ecommerce.projeto.model.domain.enums.TipoCliente;

import java.util.Objects;

public class Cliente extends Pessoa{
    private String cpfOuCnpj;
    private Integer tipo;



    public Cliente() {
    }


    public Cliente(String nome, String email, String cpfOuCnpj,
                   Integer tipo, Cidade cidade){
        super(nome, email, cidade);
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipo = tipo;
    }
    public Cliente(String nome, String email, String cpfOuCnpj,
                   TipoCliente tipo, Cidade cidade){
        super(nome, email, cidade);
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipo = tipo.getCod();
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
