package br.com.ecommerce.projeto.model.repositories.implementacao;

import br.com.ecommerce.projeto.model.domain.Cliente;
import br.com.ecommerce.projeto.model.repositories.ClienteRepository;

import java.io.*;
import java.util.List;

public class ClienteRepositoryImpl implements ClienteRepository {

    private Cliente cliente;
    BufferedWriter bw = new BufferedWriter(new FileWriter("cliente_db.txt", true));
    BufferedReader br = new BufferedReader(new FileReader("cliente_db.txt"));
    public ClienteRepositoryImpl(Cliente cliente) throws IOException {
        this.cliente = cliente;
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
    public void adicionarCliente(Cliente cliente) throws IOException {
        bw.write(cliente.getCpfOuCnpj()+", "+cliente.getNome()+","
                +cliente.getEmail()+","+","+cliente.getTipo()+cliente.getCidade()+","+cliente.getEmail()+
                ","+cliente.getIdade()+","+cliente.getSexo());
        bw.flush();
        bw.newLine();
        bw.close();
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
