package br.com.ecommerce.projeto.model.services;

import br.com.ecommerce.projeto.model.domain.Cliente;

public abstract class ClienteService {
    Cliente cliente;
    public ClienteService(Cliente cliente){
        this.cliente = cliente;
    }

    public abstract double calculoDesconto(Double precoProd);
}
