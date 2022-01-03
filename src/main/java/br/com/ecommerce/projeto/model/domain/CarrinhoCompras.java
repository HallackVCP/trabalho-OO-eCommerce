package br.com.ecommerce.projeto.model.domain;

public class CarrinhoCompras {
    private Listas<Pedido> pedidos;
    private double precoTotal;


    public void setPrecoTotal(){
        double preco = 0;
        for (Pedido pedido:
             pedidos) {
            preco+= pedido.getPrecoTotal();
        }
    }

    public Listas<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Listas<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }
}
