package br.com.fiap.healthtrack.medidas.alimentacao;

import br.com.fiap.healthtrack.medidas.MedidaCalorico;

/**
 * @author Daniel Silva
 * Suporte a Medidas de Alimentação do HealthTrack
 *
 */
public class Alimentacao extends MedidaCalorico<TipoAlimentacao> {

	/**
	 * @param tipo
	 * @param calorias
	 * @param descricao
	 */
	public Alimentacao(TipoAlimentacao tipo, int calorias, String descricao) {
		super(tipo, calorias, descricao);
	}

}