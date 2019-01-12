package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;

public final class Carro extends Veiculo {
	
	private int qtdPortas;
		
	
	/**
	 * Construtor da classe carro
	 * @param marca
	 * @param modelo
	 * @param motor
	 * @param ano
	 * @param chassi
	 * @throws Exception
	 */
	public Carro(String marca, String modelo, String motor, String ano, String chassi) throws ChassiInvalidoException {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setMotor(motor);
		this.setAno(ano);
		try {
			this.setChassi(chassi);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: "+ e.getMessage());
		}
		this.qtdRodas = 4;
	}
	
	/**
	 * Construtor padrão
	 */
	public Carro() {
		
	}
	
	/**
	 * 
	 * @return qtdPortas
	 */
	public int getQtdPortas() {
		return qtdPortas;
	}
	
	/**
	 * 
	 * @param qtdPortas
	 */
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	@Override
	public void preparar() {
		System.out.println("Coloque o sinto de segurança");		
	}
	
	
}
