package br.com.treinaweb.java.basico.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EstudoSet {

	public static void main(String[] args) {
		
		Set<String> nomes = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		
		String nome = "";
		
		while(!nome.equals("sair")) {
			System.out.print("Digite um nome de pessoa: ");
			if(!nome.equals("sair")) {
				nomes.add(nome);
			}
		}
		System.out.print("O nome digitados são: ");
		Iterator<String> it = nomes.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		sc.close();
		
	}

}
