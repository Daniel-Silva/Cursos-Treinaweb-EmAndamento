package br.com.fiap.mercado.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nome;
	private float valor;
	private Calendar dtValidade;
	
		
	/**
	 * Construtor Produto
	 * @param codigo
	 * @param nome
	 * @param valor
	 * @param dtValidade
	 */
	public Produto(int codigo, String nome, float valor, Calendar dtValidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.dtValidade = dtValidade;
	}
	
	/**
	 * Construtor padrão
	 */
	public Produto() {
		
	}

	/**
	 * 
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * 
	 * @return
	 */
	public float getValor() {
		return valor;
	}
	
	/**
	 * 
	 * @param valor
	 */
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	/**
	 * 
	 * @return
	 */
	public Calendar getDtValidade() {
		return dtValidade;
	}
	
	/**
	 * 
	 * @param dtValidade
	 */
	public void setDtValidade(Calendar dtValidade) {
		this.dtValidade = dtValidade;
	}

	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return "Produto [codigo=" + codigo
									+ ", nome=" + nome
									+ ", valor=" + valor
									+ ", dtValidade="
									+ sdf.format(dtValidade.getTime())
									+ "]";
	}
	
	
}
