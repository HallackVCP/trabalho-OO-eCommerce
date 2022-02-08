package br.com.ecommerce.projeto.model.services;

import br.com.ecommerce.projeto.model.domain.Cliente;

public class ClienteCPFService extends ClienteService{
    public ClienteCPFService(Cliente cliente) {
        super(cliente);
    }

    @Override
    public double calculoDesconto(Double precoProd) {
        double desconto;
        if(precoProd < 150 && precoProd > 15){
            desconto = precoProd * 0.25;
        }else{
            desconto = 0;
        }
        return desconto;
    }


}
