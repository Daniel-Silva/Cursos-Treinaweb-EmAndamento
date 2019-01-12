package br.com.java.basic.app;

import br.com.treinaweb.java.basic.classes.Conta;
import br.com.treinaweb.java.basic.classes.ContaCorrente;

public class Main {

	public static void main (String[] args) {
		
		Conta conta = new ContaCorrente("Daniel Silva", "dani3l.dxp@gmail.com", "11983804055");
		
		System.out.println(conta.getNome());
		System.out.println(conta.getEmail());
		System.out.println(conta.getTelefone());
		System.out.println("00100" + conta.getConta());
		
		conta.depositar(20);
		System.out.println("R$" + conta.getSaldo());
		((ContaCorrente)conta).setCompra(10);
		System.out.println("R$" + conta.getSaldo());
		
		
		
	}
	
}
