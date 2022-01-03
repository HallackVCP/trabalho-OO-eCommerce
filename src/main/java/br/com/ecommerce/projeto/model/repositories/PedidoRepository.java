package br.com.ecommerce.projeto.model.repositories;

import br.com.ecommerce.projeto.model.domain.Pedido;

import java.util.List;

public interface PedidoRepository {

    public List<Pedido> buscarTodosPedidos();
    public Pedido buscarPedidoPorCodigo(String cod);
    public void adicionarPedido(Pedido pedido);
    public void atualizarPedido(Pedido pedido);
    public List<Pedido> deletarTodosPedidos();
    public List<Pedido> deletarPedidoPorCodigo(String cod);

}
