package br.com.ecommerce.projeto.model.services;

import br.com.ecommerce.projeto.model.domain.Cliente;

public class ClienteCNPJService extends ClienteService{
    public ClienteCNPJService(Cliente cliente) {
        super(cliente);
    }

    @Override
    public double calculoDesconto(Double precoProd) {
        double desconto;
        if(precoProd > 150){
            desconto = precoProd * 0.18;
        }else{
            desconto = 0;
        }
        return desconto;
    }
}
