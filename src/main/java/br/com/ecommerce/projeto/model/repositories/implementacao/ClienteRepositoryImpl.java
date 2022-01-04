package br.com.ecommerce.projeto.model.repositories.implementacao;

import br.com.ecommerce.projeto.model.domain.Cliente;
import br.com.ecommerce.projeto.model.repositories.ClienteRepository;

import java.io.*;
import java.util.List;

public class ClienteRepositoryImpl implements ClienteRepository {

    BufferedWriter bw = new BufferedWriter(new FileWriter("cliente_db.txt", true));
    BufferedReader br = new BufferedReader(new FileReader("cliente_db.txt"));
    public ClienteRepositoryImpl() throws IOException {
    }

    @Override
    public List<Cliente> buscarTodosClientes() {
        return null;
    }

    @Override
    public Cliente buscarClientePorCodigo(String cpfOuCnpj) {
        return null;
    }

    @Override
    public void adicionarCliente(Cliente cliente) {

    }

    @Override
    public void atualizarCliente(Cliente cliente) {

    }

    @Override
    public List<Cliente> deletarTodosClientes() {
        return null;
    }

    @Override
    public List<Cliente> deletarClientePorCodigo(String cpfOuCnpj) {
        return null;
    }
}
