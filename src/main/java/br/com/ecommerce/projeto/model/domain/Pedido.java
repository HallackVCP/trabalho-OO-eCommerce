package br.com.ecommerce.projeto.model.domain;

import java.time.LocalDate;
import java.util.Iterator;

public class Pedido implements Iterable<Produto> {
    private Integer codigo;
    private Listas<Produto> produtos;
    private LocalDate dataCompra;
    private Double precoTotal;

    public Pedido(){}

    public Pedido(Integer codigo, LocalDate dataCompra, Produto produto){
        super();
        this.codigo = codigo;
        this.dataCompra = dataCompra;
        this.produtos = new Listas<>(produto);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Listas<Produto> getProdutos() {
        return produtos;
    }

    public void Adicionar(Produto produto){produtos.Adicionar(produto);}
    public Iterator<Produto> iterator(){return produtos.iterator();}

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }



    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal() {
        double preco = 0;
        for (Produto produto:produtos) {
            preco += produto.getPreco()* produto.getQtd();
        }
        this.precoTotal = preco;
    }
}
