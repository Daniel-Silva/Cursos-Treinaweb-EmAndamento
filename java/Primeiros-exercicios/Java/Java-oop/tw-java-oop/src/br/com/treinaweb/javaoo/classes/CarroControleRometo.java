package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoException;
import br.com.treinaweb.javaoo.interfaces.AndarInterface;
import br.com.treinaweb.javaoo.interfaces.LigadorInterface;

public class CarroControleRometo implements LigadorInterface, AndarInterface {

	@Override
	public void acelerar() throws AceleracaoVeiculoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frear() throws FrenagemVeiculoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
	}
	
}
