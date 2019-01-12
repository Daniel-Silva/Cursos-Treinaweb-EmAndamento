package br.com.treinaweb.java.basic.classes;

import br.com.treinaweb.java.basic.interfaces.ContaPoupancaInterface;

public class ContaPoupanca extends Conta implements ContaPoupancaInterface {

	
	/**
	 * Construtor com parâmetos
	 * @param nome
	 * @param email
	 * @param telefone
	 */
	public ContaPoupanca(String nome, String email, String telefone) {
		super(nome, email, telefone);
		// TODO Auto-generated constructor stub
	}
	
	public ContaPoupanca() {
		super();
	}

	private float juros;
	
	@Override
	public void depositar(float valor) {
		this.saldo += (valor + this.juros);		
	}
	
	public float getJuros() {
		float juros = this.saldo * (float)0.01;
		return juros;
	}
	
	@Override
	public float getSaldo() {
		return saldo + getJuros();
	}
	
}
