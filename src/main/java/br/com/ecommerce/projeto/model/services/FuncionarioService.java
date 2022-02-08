package br.com.ecommerce.projeto.model.services;

import br.com.ecommerce.projeto.model.domain.Funcionario;

public abstract class FuncionarioService {
        Funcionario funcionario;
        public FuncionarioService(Funcionario funcionario){
            this.funcionario = funcionario;
    }

    public abstract double calculoBonus();
}
