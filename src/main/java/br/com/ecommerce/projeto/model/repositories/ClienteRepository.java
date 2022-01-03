package br.com.ecommerce.projeto.model.repositories;

import br.com.ecommerce.projeto.model.domain.Cliente;


import java.util.List;

public interface ClienteRepository {

    public List<Cliente> buscarTodosClientes();
    public Cliente buscarClientePorCodigo(String cpfOuCnpj);
    public void adicionarCliente(Cliente cliente);
    public void atualizarCliente(Cliente cliente);
    public List<Cliente> deletarTodosClientes();
    public List<Cliente> deletarClientePorCodigo(String cpfOuCnpj);
}
