package br.com.ecommerce.projeto.model.repositories.implementacao;

import br.com.ecommerce.projeto.model.domain.Cidade;
import br.com.ecommerce.projeto.model.domain.enums.Estado;
import br.com.ecommerce.projeto.model.repositories.CidadeRepository;

import java.io.*;
import java.util.List;

public class CidadeRepositoryImpl implements CidadeRepository {
    private Cidade cidade;
    BufferedWriter bw = new BufferedWriter(new FileWriter("cidade_db.txt", true));
    BufferedReader br = new BufferedReader(new FileReader("cidade_db.txt"));

    public CidadeRepositoryImpl(Cidade cidade) throws IOException {
        this.cidade = cidade;
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
    public List<Cidade> buscarCidadePorEstado(Estado estado) {
        return null;
    }

    @Override
    public void adicionarCidade(Cidade cidade) throws IOException {
        bw.write(cidade.getNome()+","+cidade.getEstado());
        bw.flush();
        bw.newLine();
        bw.close();
    }

    @Override
    public void atualizarCidade(Cidade cidade) {

    }

    @Override
    public List<Cidade> deletarTodosCidades() {
        return null;
    }



    @Override
    public List<Cidade> deletarCidadesPorEstado(Estado estado) {
        return null;
    }
}
