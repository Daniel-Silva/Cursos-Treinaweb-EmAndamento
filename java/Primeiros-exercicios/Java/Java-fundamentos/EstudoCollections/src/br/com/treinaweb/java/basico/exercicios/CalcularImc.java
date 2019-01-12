package br.com.treinaweb.java.basico.exercicios;

import java.util.Scanner;

public class CalcularImc {
	/**
	 * @author Daniel Silva
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);		
		
		System.out.println("=== CALCULAR IMC ===");
		System.out.print("Informe seu peso: ");
		double peso = leitor.nextDouble();
		System.out.print("Informe sua altura: ");
		float altura = leitor.nextFloat();
		
		double imc = peso / (altura * altura);
		
		System.out.println("Seu IMC é: " + imc);
		
		leitor.close();
	}
	
}
