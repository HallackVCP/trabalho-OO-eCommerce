package br.com.ecommerce.projeto.model.services;

import br.com.ecommerce.projeto.model.domain.Funcionario;

public class GerenteService extends FuncionarioService{


    public GerenteService(Funcionario funcionario) {
        super(funcionario);
    }

    @Override
    public double calculoBonus() {
        double bonus = (this.funcionario.getSalario() * 0.15)+(this.funcionario.getSalario()/12);
        return bonus;
    }
}
