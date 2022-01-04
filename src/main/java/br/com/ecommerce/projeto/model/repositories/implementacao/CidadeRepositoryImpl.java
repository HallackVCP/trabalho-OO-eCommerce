package br.com.ecommerce.projeto.model.repositories.implementacao;

import br.com.ecommerce.projeto.model.domain.Cidade;
import br.com.ecommerce.projeto.model.domain.enums.Estado;
import br.com.ecommerce.projeto.model.repositories.CidadeRepository;

import java.io.*;
import java.util.List;

public class CidadeRepositoryImpl implements CidadeRepository {

    BufferedWriter bw = new BufferedWriter(new FileWriter("cidade_db.txt", true));
    BufferedReader br = new BufferedReader(new FileReader("cidade_db.txt"));

    public CidadeRepositoryImpl() throws IOException {
    }

    @Override
    public List<Cidade> buscarTodosCidades() {
        return null;
    }

    @Override
    public Cidade buscarCidadePorNome(String nome) {
        return null;
    }

    @Override
    public Cidade buscarCidadePorCodigo(String cod) {
        return null;
    }

    @Override
    public List<Cidade> buscarCidadePorEstado(Estado estado) {
        return null;
    }

    @Override
    public void adicionarCidade(Cidade cidade) {

    }

    @Override
    public void atualizarCidade(Cidade cidade) {

    }

    @Override
    public List<Cidade> deletarTodosCidades() {
        return null;
    }

    @Override
    public List<Cidade> deletarCidadePorCodigo(String cod) {
        return null;
    }

    @Override
    public List<Cidade> deletarCidadesPorEstado(Estado estado) {
        return null;
    }
}
