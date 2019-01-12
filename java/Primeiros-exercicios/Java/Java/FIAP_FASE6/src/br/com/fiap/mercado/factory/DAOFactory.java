package br.com.fiap.mercado.factory;

import br.com.fiap.mercado.impl.ProdutoImpl;
import br.com.fiap.mercado.interfaces.ProdutoInterface;

public abstract class DAOFactory {
	public static ProdutoInterface getProdutoDAO() {
		return new ProdutoImpl();
	}
}
