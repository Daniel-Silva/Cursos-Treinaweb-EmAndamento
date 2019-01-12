package br.com.fiap.entites;

import java.io.Serializable;

public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private float valor;
	
		
	public Produto(String nome, float valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	public Produto() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	

}
