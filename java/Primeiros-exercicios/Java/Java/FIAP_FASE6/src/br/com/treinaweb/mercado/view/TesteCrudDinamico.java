package br.com.treinaweb.mercado.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.mercado.exception.ConexaoException;
import br.com.fiap.mercado.factory.DAOFactory;
import br.com.fiap.mercado.interfaces.ProdutoInterface;
import br.com.fiap.mercado.model.Produto;


public class TesteCrudDinamico {

	public static void main(String[] args) throws ConexaoException {
		ProdutoInterface dao = DAOFactory.getProdutoDAO();
		
		Produto produto = new Produto();
		produto.setNome("Abacaxi");
		produto.setValor(5);
		Calendar calendar = new GregorianCalendar(2018, 12, 29);
		produto.setDtValidade(calendar);
		
		produto.setCodigo(4);
		produto.setValor(7);
		
		dao.atualizar(produto);
		
		List<Produto> produtos = dao.buscarTodos();
		
		for(Produto prod: produtos) {
			System.out.println(prod.toString());
		}
		
	}

}
