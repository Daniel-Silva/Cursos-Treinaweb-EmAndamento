package br.com.treinaweb.java.basic.execoes;

public class SacarException extends Exception {

	private static final long serialVersionUID = -55477099395373836L;
	
	public SacarException(float valor) {
		super(String.format("O valor [%r] é maior que o saldo", valor));
	}
	
}
