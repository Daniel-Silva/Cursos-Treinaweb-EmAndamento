package br.com.treinaweb.java.basico.oop.exercicios;

import java.util.Date;

/**
 * @author Daniel Silva
 * Representação de um user da aplicação
 */

public class User {

	private String nome;
	private Date dtNasc;
	private String genero;
	private float altura;
	private String email;
	private String password;
	private static int id;
	
	/**
	 * 
	 * @param nome
	 * @param dtNasc
	 * @param genero
	 * @param altura
	 * @param email
	 * @param password
	 * @param id
	 */
	public User(String nome, Date dtNasc, String genero, float altura, String email, String password, int id ){
		super();
		this.nome = nome;
		this.dtNasc = dtNasc;
		this.genero = genero;
		this.altura = altura;
		this.email = email;
		this.password = password;
		User.id = id;
	}
	
	/**
	 * Este construtor é utilizado pela tela de configurações
	 * @param nome
	 * @param dtNasc
	 * @param genero
	 * @param altura
	 * @param email
	 */
	public User(String nome, Date dtNasc, String genero, float altura, String email){
		super();
		this.nome = nome;
		this.dtNasc = dtNasc;
		this.genero = genero;
		this.altura = altura;
		this.email = email;
	}
	
	/**
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return
	 */
	public Date getDtNasc() {
		return dtNasc;
	}
	
	/**
	 * @param dtNasc
	 */
	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}
	
	/**
	 * @return
	 */
	public String getGenero() {
		return genero;
	}
	
	/**
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	/**
	 * @return
	 */
	public double getAltura() {
		return altura;
	}
	
	/**
	 * @param altura
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return
	 */
	public static int getId() {
		return id;
	}
	
	/**
	 * @param id
	 */
	public static void setId(int id) {
		User.id = id;
	}
}
