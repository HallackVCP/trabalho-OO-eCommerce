package br.com.ecommerce.projeto.model.services;

import br.com.ecommerce.projeto.model.domain.Funcionario;

public class VendedorService extends FuncionarioService{


    public VendedorService(Funcionario funcionario) {
        super(funcionario);
    }

    @Override
    public double calculoBonus() {
        double bonus = (this.funcionario.getSalario() * 0.005)+12;
        return bonus;
    }
}
