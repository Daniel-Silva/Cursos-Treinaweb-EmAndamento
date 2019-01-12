package br.com.treinaweb.java.basico.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EstudoMaps {

	public static void main(String[] args) {
		/**
		 * Declarando HasMap
		 */
		Map<String, Integer> notas = new HashMap<String, Integer>();
		
		Scanner leitorString = new Scanner(System.in);
		Scanner leitorInt = new Scanner(System.in);
		Boolean continuar = true;
		
		while(continuar) {
			System.out.print("Digite o nome do aluno: ");
			String nomeAluno = leitorString.nextLine();
			System.out.print("Digite a nota do aluno: ");
			int notaAluno = leitorInt.nextInt();
			notas.put(nomeAluno, notaAluno);
			System.out.print("Deseja continuar? [S]im - [N]ão: ");
			String continueAdd = leitorString.nextLine();
			if(continueAdd.equals("N")) {
				continuar = false;
			}
		}
		System.out.println("As notas da classe foram: ");
		for(String nomeAluno : notas.keySet()) {
			System.out.println(nomeAluno + " = "+ notas.get(nomeAluno));
		}
		
		leitorInt.close();
		leitorString.close();
	}
	
}
