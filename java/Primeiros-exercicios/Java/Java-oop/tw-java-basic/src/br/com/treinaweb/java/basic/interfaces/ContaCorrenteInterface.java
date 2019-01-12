package br.com.treinaweb.java.basic.interfaces;

import br.com.treinaweb.java.basic.execoes.LimiteCartaoException;

public interface ContaCorrenteInterface {
	
	void CartaoCredito(float compra) throws LimiteCartaoException;
	float getLimiteCartao();
	
}
