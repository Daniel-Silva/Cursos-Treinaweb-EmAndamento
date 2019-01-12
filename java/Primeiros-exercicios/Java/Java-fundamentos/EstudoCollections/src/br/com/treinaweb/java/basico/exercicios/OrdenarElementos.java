package br.com.treinaweb.java.basico.exercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrdenarElementos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Boolean leitor = true;
		List<Integer> ordenarNumeros = new ArrayList<Integer>();
		
		System.out.println("=== ORDENAR LISTA DE NÚMEROS ===");
		while(leitor) {
			System.out.print("Informe um novo valor: ");
			ordenarNumeros.add(sc.nextInt());
			System.out.println("Deseja continuar? [S]im ou [N]ão");
			String continuar = sc.nextLine();
			
			if(continuar == "N") {
				leitor = false;
			}
		}

		
	}
	
}
