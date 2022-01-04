package br.com.ecommerce.projeto.model.repositories.implementacao;

import br.com.ecommerce.projeto.model.domain.Produto;
import br.com.ecommerce.projeto.model.repositories.ProdutoRepository;

import java.io.*;
import java.util.List;

public class ProdutoRepositoryImpl implements ProdutoRepository {

    BufferedWriter bw = new BufferedWriter(new FileWriter("produto_db.txt", true));
    BufferedReader br = new BufferedReader(new FileReader("produto_db.txt"));

    public ProdutoRepositoryImpl() throws IOException {
    }

    @Override
    public List<Produto> buscarTodosprodutos() {
        return null;
    }

    @Override
    public Produto buscarprodutoPorCodigo(String cod) {
        return null;
    }

    @Override
    public void adicionarproduto(Produto produto) {

    }

    @Override
    public void atualizarproduto(Produto produto) {

    }

    @Override
    public List<Produto> deletarTodosprodutos() {
        return null;
    }

    @Override
    public List<Produto> deletarprodutoPorCodigo(String cod) {
        return null;
    }
}
