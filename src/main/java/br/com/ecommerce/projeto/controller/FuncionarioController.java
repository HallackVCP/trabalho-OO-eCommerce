package br.com.ecommerce.projeto.controller;

import br.com.ecommerce.projeto.model.domain.Cliente;
import br.com.ecommerce.projeto.model.domain.Funcionario;
import br.com.ecommerce.projeto.model.repositories.implementacao.FuncionarioRepositoryImpl;
import br.com.ecommerce.projeto.model.services.FuncionarioService;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    private FuncionarioService service;
    private FuncionarioRepositoryImpl repo = new FuncionarioRepositoryImpl();

    public FuncionarioController() throws IOException {
    }

    public void save(Funcionario funcionario) {
        try{
            repo.save(funcionario);
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");

        }
    }
    public List<Funcionario> findAll()  {
        try{
            return repo.findAll();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");
            List<Funcionario> funcionarios = new ArrayList<>();
            return funcionarios;
        }
    }

    public Funcionario find(Funcionario funcionario)  {
        try{
            return repo.findByCod(funcionario.getMatricula());
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");
            return null;
        }
    }
    public Funcionario findByCod(String cod){
        try{
            return repo.findByCod(cod);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");
            return null;
        }
    }
    public void update(Funcionario funcionario)  {
        try{
            repo.update(funcionario);
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");

        }
    }
    public void delete(Funcionario funcionario)  {
        try{
            repo.delete(funcionario);
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
