package br.com.ecommerce.projeto.model.repositories;

import java.io.IOException;
import java.util.List;

public interface Repository <T>{

    public List<T> findAll() throws IOException;
    public T findByCod(String cod) throws IOException;
    public void save(T obj) throws IOException;
    public void update(T obj) throws IOException;
    public void delete(T obj) throws IOException;
    public void deleteAll() throws IOException;


}
