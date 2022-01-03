package br.com.ecommerce.projeto.model.domain;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Listas<T> implements Iterable<T>{


    private final List<T> lista;
    public Listas(T ... itens){
        this.lista = Arrays.stream(itens)
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
    public void Adicionar(T item){this.lista.add(item);}

}
