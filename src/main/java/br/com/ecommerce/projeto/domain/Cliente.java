package br.com.ecommerce.projeto.domain;


import br.com.ecommerce.projeto.domain.enums.SexoCliente;
import br.com.ecommerce.projeto.domain.enums.TipoCliente;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {
    
    private String nome;
    private String email;
    private String cpfOuCnpj;
    private Integer tipo;
    private Integer idade;
    private SexoCliente sexo;
    private LocalDate dataNascimento;
    private Cidade cidade;

    public Cliente() {
    }
    public Cliente(String nome,String email, String cpfOuCnpj,
                   TipoCliente tipo, LocalDate dataNascimento, SexoCliente sexo, Integer idade, Cidade cidade) {
        super();
        this.nome = nome;
        this.email = email;
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipo = tipo.getCod();
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.idade = idade;
        this.cidade = cidade;

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

    public SexoCliente getSexo() {
        return sexo;
    }

    public void setSexo(SexoCliente sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
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
