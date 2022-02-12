package br.com.ecommerce.projeto.controller;

import br.com.ecommerce.projeto.model.domain.Cidade;
import br.com.ecommerce.projeto.model.domain.Produto;
import br.com.ecommerce.projeto.model.repositories.implementacao.ProdutoRepositoryImpl;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    private ProdutoRepositoryImpl repo = new ProdutoRepositoryImpl();

    public ProdutoController() throws IOException {
    }

    public void save(Produto produto) {
        try{
            repo.save(produto);
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");

        }
    }
    public List<Produto> findAll()  {
        try{
            return repo.findAll();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");
            List<Produto> produtos = new ArrayList<>();
            return produtos;
        }
    }

    public Produto find(Produto produto)  {
        try{
            return repo.findByCod(produto.getCodigoProduto());
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");
            return null;
        }
    }
    public void update(Produto produto)  {
        try{
            repo.update(produto);
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");
        }
    }
    public void delete(Produto produto)  {
        try{
            repo.delete(produto);
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");

        }
    }
    public void deleteAll() {
        try{
            repo.deleteAll();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");

        }
    }
}
