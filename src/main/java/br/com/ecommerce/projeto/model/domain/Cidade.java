package br.com.ecommerce.projeto.model.domain;
import br.com.ecommerce.projeto.model.domain.enums.Estado;


import java.util.Objects;

public class Cidade {

    private String nome;

    private Estado estado;




    public Cidade(){}

    public Cidade(String nome, Estado estado){
        super();
        this.nome = nome;
        this.estado = estado;
    }
    public Cidade(String nome, String estado){
        this.nome = nome;
        this.estado= Estado.valueOf(estado);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return Objects.equals(nome, cidade.nome) && estado == cidade.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, estado);
    }
}
