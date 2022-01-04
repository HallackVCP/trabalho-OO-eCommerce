package br.com.ecommerce.projeto.model.repositories.implementacao;

import br.com.ecommerce.projeto.model.domain.Funcionario;
import br.com.ecommerce.projeto.model.repositories.FuncionarioRepository;

import java.io.*;
import java.util.List;

public class FuncionarioRepositoryImpl implements FuncionarioRepository {
    BufferedWriter bw = new BufferedWriter(new FileWriter("funcionario_db.txt", true));
    BufferedReader br = new BufferedReader(new FileReader("funcionario_db.txt"));
    public FuncionarioRepositoryImpl() throws IOException {
    }

    @Override
    public List<Funcionario> buscarTodosFuncionarios() {
        return null;
    }

    @Override
    public Funcionario buscarFuncionarioPorCodigo(String matricula) {
        return null;
    }

    @Override
    public void adicionarFuncionario(Funcionario funcionario) {

    }

    @Override
    public void atualizarFuncionario(Funcionario funcionario) {

    }

    @Override
    public List<Funcionario> deletarTodosFuncionarios() {
        return null;
    }

    @Override
    public List<Funcionario> deletarFuncionarioPorCodigo(String matricula) {
        return null;
    }
}
