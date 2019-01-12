package br.com.treinaweb.java.basico.oop;

import br.com.treinaweb.java.basico.oop.Carro;

public class Fabrica {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.setModelo("New Fiesta");
		c1.setCor("Branco");
		c1.setMotor("1.6cv");
		c1.ligar();		
	}
	
}
