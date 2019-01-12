package br.com.treinaweb.java.basico.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstudoLista {
	public static void main(String[] args) {
		
		/**
		 * Declarando ArrayList
		 */
		List<String> nomes = new ArrayList<String>();
		
		/**
		 * Declarando Scanner
		 */
		Scanner sc = new Scanner(System.in);
		
		String nome = "sair";
		
		
		do {
			System.out.print("Digite um nome conhecido: ");
			nome = sc.nextLine();
			if (!nome.equals("sair")) {
				nomes.add(nome);
			}
			
		} while(!nome.equals("sair")); {
			System.out.println("Os seus amigos são:");
			for(int i = 0; i < nomes.size(); i++) {
				System.out.println(nomes.get(i));
			}
			sc.close();
		}		
	}
}
