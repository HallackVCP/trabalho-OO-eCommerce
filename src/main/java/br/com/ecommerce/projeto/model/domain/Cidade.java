package br.com.ecommerce.projeto.model.domain;
import br.com.ecommerce.projeto.model.domain.enums.Estado;

import java.util.Objects;

public class Cidade {

    private String nome;

    private Estado estado;
    private static int cod = 0;
    private int id;



    public Cidade(){}

    public Cidade(String nome, Estado estado){
        super();
        this.nome = nome;
        this.estado = estado;
        this.cod +=1;
        this.id = cod;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return id == cidade.id && Objects.equals(nome, cidade.nome) && estado == cidade.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, estado, id);
    }
}
