package br.com.ecommerce.projeto.model.repositories;

import br.com.ecommerce.projeto.model.domain.Produto;

import java.util.List;

public interface ProdutoRepository {
    public List<Produto> buscarTodosprodutos();
    public Produto buscarprodutoPorCodigo(String cod);
    public void adicionarproduto(Produto produto);
    public void atualizarproduto(Produto produto);
    public List<Produto> deletarTodosprodutos();
    public List<Produto> deletarprodutoPorCodigo(String cod);
}