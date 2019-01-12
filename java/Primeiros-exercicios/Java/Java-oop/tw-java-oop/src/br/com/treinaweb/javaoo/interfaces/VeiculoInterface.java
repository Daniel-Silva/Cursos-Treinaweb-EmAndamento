package br.com.treinaweb.javaoo.interfaces;


import br.com.treinaweb.javaoo.excecoes.ValidarAbastecimentoException;

public interface VeiculoInterface {
	
	void abastecer(float litros) throws ValidarAbastecimentoException;
	void preparar();
}
