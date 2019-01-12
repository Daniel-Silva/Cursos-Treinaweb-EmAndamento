package br.com.treinaweb.java.basic.generic;

import java.util.ArrayList;
import java.util.List;

import br.com.treinaweb.java.basic.classes.Conta;

public class ManipularConta<T extends Conta> {
	
	private List<T> contas = new ArrayList<T>();
	
	/**
	 * 
	 * @return
	 */
	public List<T> getContas (){
		return contas;
	}
	
	/**
	 * 
	 * @param indice
	 * @return contas
	 */
	public T getPorPosicao (int indice) {
		return contas.get(indice);
	}
	
	/**
	 * 
	 * @param conta
	 */
	public void inserirConta(T conta) {
		contas.add(conta);
	}
}
