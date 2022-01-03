package br.com.ecommerce.projeto.model.domain;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Produtos implements Iterable<Produto>{

    private final List<Produto> lista;

    public Produtos(Produto ... produtos){
        this.lista = Arrays.stream(produtos)
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<Produto> iterator() {
        return lista.iterator();
    }
    public void adicionar(Produto produto){
        this.lista.add(produto);
    }
}
