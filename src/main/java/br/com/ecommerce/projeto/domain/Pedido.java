package br.com.ecommerce.projeto.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pedido implements Iterable<Produto> {
    private Integer codigo;
    private Produtos produtos;
    private LocalDate dataCompra;
    private Integer qtd;

    public Pedido(){}

    public Pedido(Integer codigo, LocalDate dataCompra, Integer qtd, Produto produto){
        super();
        this.codigo = codigo;
        this.dataCompra = dataCompra;
        this.qtd = qtd;
        this.produtos = new Produtos(produto);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void Adicionar(Produto produto){produtos.adicionar(produto);}
    public Iterator<Produto> iterator(){return produtos.iterator();}

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }
}
