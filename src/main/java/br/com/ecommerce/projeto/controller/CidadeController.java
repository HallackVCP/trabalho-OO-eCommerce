package br.com.ecommerce.projeto.controller;

import br.com.ecommerce.projeto.model.domain.Cidade;
import br.com.ecommerce.projeto.model.repositories.implementacao.CidadeRepositoryImpl;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CidadeController {

    private CidadeRepositoryImpl repo = new CidadeRepositoryImpl();

    public CidadeController() throws IOException {
    }

    public void save(Cidade cidade) {
        try{
            repo.save(cidade);
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");

        }
    }
    public List<Cidade> findAll()  {
        try{
            return repo.findAll();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");
            List<Cidade> cidades = new ArrayList<>();
            return cidades;
        }
    }

    public Cidade find(Cidade cidade)  {
        try{
            return repo.findByCod(cidade.getNome());
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");
            return null;
        }
    }
    public void update(Cidade cidade)  {
        try{
            repo.update(cidade);
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");
        }
    }
    public void delete(Cidade cidade)  {
        try{
            repo.delete(cidade);
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
