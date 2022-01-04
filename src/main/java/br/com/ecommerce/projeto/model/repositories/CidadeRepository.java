package br.com.ecommerce.projeto.model.repositories;

import br.com.ecommerce.projeto.model.domain.Cidade;
import br.com.ecommerce.projeto.model.domain.enums.Estado;

import java.util.List;

public interface CidadeRepository {

    public List<Cidade> buscarTodosCidades();
    public Cidade buscarCidadePorNome(String nome);
    public Cidade buscarCidadePorCodigo(String cod);
    public List<Cidade> buscarCidadePorEstado(Estado estado);
    public void adicionarCidade(Cidade cidade);
    public void atualizarCidade(Cidade cidade);
    public List<Cidade> deletarTodosCidades();
    public List<Cidade> deletarCidadePorCodigo(String cod);
    public List<Cidade> deletarCidadesPorEstado(Estado estado);
}
