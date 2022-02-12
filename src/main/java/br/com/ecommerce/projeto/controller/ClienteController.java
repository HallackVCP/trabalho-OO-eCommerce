package br.com.ecommerce.projeto.controller;

import br.com.ecommerce.projeto.model.domain.Cliente;
import br.com.ecommerce.projeto.model.repositories.implementacao.ClienteRepositoryImpl;
import br.com.ecommerce.projeto.model.services.ClienteService;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private ClienteService service;
    private ClienteRepositoryImpl repo = new ClienteRepositoryImpl();

    public ClienteController() throws IOException {
    }


    public void save(Cliente cliente) {
        try{
            repo.save(cliente);
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");

        }
    }
    public List<Cliente> findAll()  {
        try{
            return repo.findAll();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");
            List<Cliente> clientes = new ArrayList<>();
            return clientes;
        }
    }

    public Cliente find(Cliente cliente)  {
        try{
            return repo.findByCod(cliente.getCpfOuCnpj());
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");
            return null;
        }
    }
    public Cliente findByCod(String cod){
        try{
            return repo.findByCod(cod);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");
            return null;
        }
    }
    public void update(Cliente cliente)  {
        try{
            repo.update(cliente);
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Problema ao acessar base de dados");

        }
    }
    public void delete(Cliente cliente)  {
        try{
            repo.delete(cliente);
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
