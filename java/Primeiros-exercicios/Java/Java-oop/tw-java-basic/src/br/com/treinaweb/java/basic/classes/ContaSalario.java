package br.com.treinaweb.java.basic.classes;

public class ContaSalario extends Conta {


	/**
	 * Construtor com parâmetos
	 * @param nome
	 * @param email
	 * @param telefone
	 */
	public ContaSalario(String nome, String email, String telefone) {
		super(nome, email, telefone);
		// TODO Auto-generated constructor stub
	}

	public ContaSalario() {
		super();
	}
	
	@Override
	public void depositar(float valor) {
		System.out.println("Função indisponível para Conta Salário");		
	}
	
	@Override
	public float getSaldo() {
		return saldo;
	}
	
}
