package br.com.treinaweb.java.basico.oop;

public class Carro {

	//Atributos da classe
	private String cor = "";
	private String modelo = "";
	private String motor = "";
	
	//Metodos da classe
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMotor() {
		return motor;
	}
	
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public void ligar() {
		System.out.println("Ligando carro");
	}
	
	public void desligar() {
		System.out.println("Deligando carro");
	}
	
	public void acelerar() {
		System.out.println("Acelerando carro");
	}
	
	public void brecar() {
		System.out.println("Brecando carro");
	}
	
	public void mudarMarcha() {
		System.out.println("Marcha engatada");
	}
}
