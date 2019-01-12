package br.com.fiap.healthtrack.medidas.peso;

import br.com.fiap.healthtrack.medidas.Medida;

/**
 * Define medida de peso para o health track
 * @author Sid
 *
 */
public class Peso extends Medida{
	
	private float pesoEmKg;
	
	/**
	 * @param pesoEmKg
	 */
	public Peso(float pesoEmKg) {
		super();
		this.pesoEmKg = pesoEmKg;
	}

	/**
	 * retorna o peso
	 * @return
	 */
	public float getPesoEmKg() {
		return pesoEmKg;
	}

	/**
	 * define um novo peso
	 * @param pesoEmKg
	 */
	public void setPesoEmKg(float pesoEmKg) {
		this.pesoEmKg = pesoEmKg;
	}
	
	

}
