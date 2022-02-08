package br.com.ecommerce.projeto.model.domain;

public class Produto {
    private String nome;
    private String codigoProduto;
    private double preco;
    private Integer qtd;

    public Produto(){}

    public Produto(String nome, String codigoProduto, double preco, Integer qtd) {
        super();
        this.nome = nome;
        this.codigoProduto = codigoProduto;
        this.preco = preco;
        this.qtd = qtd;
    }
    public Produto(String nome, double preco){
        super();
        this.nome = nome;
        this.preco = preco;
    }
    public Produto(String nome, String codigoProduto, double preco){
        super();
        this.nome = nome;
        this.codigoProduto = codigoProduto;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;

        return codigoProduto != null ? codigoProduto.equals(produto.codigoProduto) : produto.codigoProduto == null;
    }

    @Override
    public int hashCode() {
        return codigoProduto != null ? codigoProduto.hashCode() : 0;
    }
}
