package br.com.treinaweb.java.basico.excecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TratandoExcecoes {
	
	/**
	 * @author Daniel Silva
	 * @param args
	 * 
	 * Tratando exceções com try catch
	 */
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		try {
			System.out.print("=== CALCULADORA ===");
			int numero = calculadora()
		}
	}

	private static int calculadora() {
		
		return 0;
	}
	
	private static int lerNumero(Scanner leitor) {
		System.out.print("Informe um número: ");
		int n1 = leitor.nextInt();
		System.out.print("Informe a operação matemática");
		char operador = leitor.next().charAt(0);
		System.out.print("Informe um número: ");
		int n2 = leitor.nextInt();
	}
	
}
