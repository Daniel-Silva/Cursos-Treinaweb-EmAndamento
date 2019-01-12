package br.com.treinaweb.java.basico.exercicios;

import java.util.Scanner;

public class CalcularArea {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("=== CALCULAR ÁREA E PERÍMETRO DE UM RENTÂNGULO ===");
		System.out.print("Informe o comprimento do retângulo: ");
		int comprimento = leitor.nextInt();
		System.out.print("Informe a largura do retângulo: ");
		int largura = leitor.nextInt();
		int area = comprimento * largura;
		int perimetro = (2 * comprimento) + (2 * largura);
		
		System.out.println("A área do retângulo é: "+ area);
		System.out.println("O perímetro do retângulo é: "+ perimetro);
		
		leitor.close();
		
	}
	
}
