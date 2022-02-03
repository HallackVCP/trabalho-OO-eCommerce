package br.com.ecommerce.projeto.model.repositories;

import br.com.ecommerce.projeto.model.domain.Funcionario;

import java.io.IOException;
import java.util.List;

public interface FuncionarioRepository {

    public List<Funcionario> buscarTodosFuncionarios();
    public Funcionario buscarFuncionarioPorCodigo(String matricula) throws IOException;
    public void adicionarFuncionario(Funcionario funcionario) throws IOException;
    public void atualizarFuncionario(Funcionario oldFuncionario, Funcionario newFuncionario) throws IOException;
    public void deletarTodosFuncionarios() throws IOException;
    public void deletarFuncionarioPorCodigo(String matricula) throws IOException;
}
