package br.com.treinaweb.jaba.basico.arrays;

import java.util.Scanner;

public class EstudoArrays {
	public static void main(String[]args) {
		String nomesAmigos[] = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Informe um nome de um amigo: ");
			nomesAmigos[i] = sc.nextLine(); 
			
		}
		System.out.println("Seus amigos são: ");
		for (int i = 0; i < 4; i++) {
			System.out.println("Amigo: "+ nomesAmigos[i]);
		}
		sc.close();
	}
}
