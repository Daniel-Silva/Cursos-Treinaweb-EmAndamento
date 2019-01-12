package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoException;
import br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoException;
import br.com.treinaweb.javaoo.excecoes.ValidarAbastecimentoException;
import br.com.treinaweb.javaoo.interfaces.AndarInterface;
import br.com.treinaweb.javaoo.interfaces.LigadorInterface;
import br.com.treinaweb.javaoo.interfaces.VeiculoInterface;

/**
 * Classe veículo para o projeto do curso de Java - Orientação a Objetos
 * @author Daniel Silva
 *
 */

public abstract class Veiculo implements VeiculoInterface, AndarInterface, LigadorInterface {
		
	/**
	 * Definindo atributos para classe veículo
	 */
	private String marca;
	private String modelo;
	private String motor;
	private String ano;
	private String chassi;
	protected int qtdRodas;
	private float qtdCombustivel;
	private Boolean ligado;
	protected float velocidade;
	
	public Veiculo() {
		this.ligado = false;
		this.velocidade = 0;
	}

	/**
	 * método para ligar o carro
	 */
	public void ligar() {
		this.ligado = true;
		this.velocidade = 0;
		System.out.println("Veículo ligado!");
	}
	
	/**
	 * método para desligar o carro
	 */
	public void desligar() {
		this.ligado = false;
		this.velocidade = 0;
		System.out.println("Veículo desligado!");
	}

	/**
	 * 
	 * @return
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * 
	 * @return
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * 
	 * @return
	 */
	public String getMotor() {
		return motor;
	}

	/**
	 * 
	 * @param motor
	 */
	public void setMotor(String motor) {
		this.motor = motor;
	}

	/**
	 * 
	 * @return
	 */
	public String getAno() {
		return ano;
	}

	/**
	 * 
	 * @param ano
	 */
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	/**
	 * 
	 * @return chassi
	 */
	public String getChassi() {
		return chassi;
	}
	
	/**
	 * 
	 * @param chassi
	 */
	public void setChassi(String chassi) throws Exception{
		if(chassi.length() == 10) {
			this.chassi = chassi;
		}else {
			throw new ChassiInvalidoException (chassi);
		}
		
	}
	
	/**
	 * 
	 * @return qtdRodas
	 */
	public int getQtdRodas() {
		return qtdRodas;
	}

	/**
	 * 
	 * @return qtdCombustivel
	 */
	public float getQtdCombustivel() {
		return qtdCombustivel;
	}

	/**
	 * 
	 * @param litros
	 * @return
	 */
	public final void abastecer(float litros) throws ValidarAbastecimentoException{
		if(!this.ligado) {
			this.qtdCombustivel += litros;
		} else {
			throw new ValidarAbastecimentoException("Desligue o veículo primeiro!");
		}
	}
	
	/**
	 * 
	 * @throws AceleracaoVeiculoException
	 */
	public void acelerar() throws AceleracaoVeiculoException{
		if(this.ligado) {
			this.velocidade += 10;
		}else {
			throw new AceleracaoVeiculoException();
		}
	}
	
	/**
	 * 
	 * @throws FrenagemVeiculoException
	 */
	public void frear() throws FrenagemVeiculoException{
		if(this.ligado) {
			this.velocidade -= 10;
		}else {
			throw new FrenagemVeiculoException();
		}
	}
	
	/**
	 * 
	 */
	public abstract void preparar();

	/**
	 * 
	 * @return ligado
	 */
	public Boolean isLigado() {
		return ligado;
	}

	/**
	 * 
	 * @return velocidade
	 */
	public float getVelocidade() {
		return velocidade;
	}	
	
	
}
