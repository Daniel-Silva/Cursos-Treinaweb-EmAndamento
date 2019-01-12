package br.com.treinaweb.java.basico.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstudoLista {
	
	/**
	 * @author Daniel Silva
	 * @param args
	 */
	public static void main (String[] args) {
		/**
		 * Declarando um ArrayList
		 */
		List nomesAmigos = new ArrayList();
		
		/**
		 * Declarando método Scanner
		 */
		Scanner leitor = new Scanner(System.in);
		
		String nome = "sair";
		
		do {
			System.out.println("Digite o nome de uma pessoa");
			nome = leitor.nextLine();
			/**
			 * Verificando e dicionando os nomes recebidos ao ArrayList
			 */
			if(!nome.equals("sair")) {
				nomesAmigos.add(nome);
			}
			
			
		} while(!nome.equals("sair"));
		
		System.out.println("Os seus amigos são: ");
		for(int i = 0; i < nomesAmigos.size(); i++) {
			System.out.println(nomesAmigos.get(i));
		}
	}
	
}
