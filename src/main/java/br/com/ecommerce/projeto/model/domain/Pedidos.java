package br.com.ecommerce.projeto.model.domain;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Pedidos implements Iterable<Pedido>{
    private final List<Pedido> lista;
    public Pedidos(Pedido ... pedidos){
        this.lista = Arrays.stream(pedidos)
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<Pedido> iterator() {
        return null;
    }
    public void Adicionar(Pedido pedido){this.lista.add(pedido);}
}
