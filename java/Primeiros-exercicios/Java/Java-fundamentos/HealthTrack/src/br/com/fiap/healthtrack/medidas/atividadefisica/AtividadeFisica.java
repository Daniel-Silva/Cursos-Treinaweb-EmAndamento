package br.com.fiap.healthtrack.medidas.atividadefisica;

import br.com.fiap.healthtrack.medidas.MedidaCalorico;

/**
 * @author Daniel Silva
 * Atividade física do Health Track
 *
 */
public class AtividadeFisica extends MedidaCalorico<TipoAtividadeFisica>{

	/**
	 * @param tipo
	 * @param calorias
	 * @param descricao
	 */
	public AtividadeFisica(TipoAtividadeFisica tipo, int calorias, String descricao) {
		super(tipo, calorias, descricao);	
	}

}
