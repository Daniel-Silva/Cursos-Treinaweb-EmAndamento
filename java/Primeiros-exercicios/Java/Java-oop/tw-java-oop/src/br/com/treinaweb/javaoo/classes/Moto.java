package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoException;

public final class Moto extends Veiculo {
	
	
	/**
	 * Construtor da classe moto
	 * @param marca
	 * @param modelo
	 * @param motor
	 * @param ano
	 * @param chassi
	 * @throws Exception
	 */
	public Moto(String marca, String modelo, String motor, String ano, String chassi) throws Exception {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setMotor(motor);
		this.setAno(ano);
		this.setChassi(chassi);
		this.qtdRodas = 2;
	}
	
	/**
	 * Construtor padrão
	 */
	public Moto(String modelo, String marca) {
		this.qtdRodas = 2;
		this.setModelo(modelo);
		this.setMarca(marca);
	}
	
	@Override
	public void acelerar() throws AceleracaoVeiculoException{
		if(this.isLigado()) {
			this.velocidade += 3;
		}else {
			throw new AceleracaoVeiculoException();
		}
	}
	
	@Override
	public void frear() throws FrenagemVeiculoException{
		if(this.isLigado()) {
			this.velocidade += 3;
		}else {
			throw new FrenagemVeiculoException();
		}
	}

	@Override
	public void preparar() {
		System.out.println("Coloque o capacete");		
	}
}
