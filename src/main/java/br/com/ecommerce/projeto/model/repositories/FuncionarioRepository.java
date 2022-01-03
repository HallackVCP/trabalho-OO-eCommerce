package br.com.ecommerce.projeto.model.repositories;

import br.com.ecommerce.projeto.model.domain.Funcionario;

import java.util.List;

public interface FuncionarioRepository {

    public List<Funcionario> buscarTodosFuncionarios();
    public Funcionario buscarFuncionarioPorCodigo(String matricula);
    public void adicionarFuncionario(Funcionario funcionario);
    public void atualizarFuncionario(Funcionario funcionario);
    public List<Funcionario> deletarTodosFuncionarios();
    public List<Funcionario> deletarFuncionarioPorCodigo(String matricula);
}
