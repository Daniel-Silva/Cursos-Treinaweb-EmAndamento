package br.com.fiap.mercado.interfaces;

import java.util.List;

import br.com.fiap.mercado.model.Produto;

public interface ProdutoInterface {
	void gravar(Produto produto);
	List<Produto> buscarTodos();
	Produto buscarTodosPorCodigo (int codigo);
	void atualizar (Produto produto);
	void remover (int codigo);
}
