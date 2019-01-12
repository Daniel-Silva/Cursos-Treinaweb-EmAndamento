package br.com.treinaweb.javaoo.interfaces;

import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoException;

public interface AndarInterface {
	void acelerar() throws AceleracaoVeiculoException;
	void frear() throws FrenagemVeiculoException;
}
