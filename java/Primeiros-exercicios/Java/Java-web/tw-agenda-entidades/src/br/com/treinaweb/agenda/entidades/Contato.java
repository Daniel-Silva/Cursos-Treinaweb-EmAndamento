package br.com.treinaweb.agenda.entidades;

public class Contato {
	
	/**
	 * Estas são as características do contato
	 */
	private int id;
	private String nome;
	private String email;
	private int idade;
	private String telefone;
	
	public Contato() {
		
	}
	
	public Contato(String nome, String email, int idade, String telefone) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	/**
	 * Este método pega o id do contato
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Este método insere o id a um contato
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Este método pega o nome do contato
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Este método insere o nome a um contato
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Este método pega o email do contato
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Este método insere o email a um contato
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Este método pega a idade do contato
	 * @return idade
	 */
	public int getIdade() {
		return idade;
	}
	
	/**
	 * Este método insere a idade a um contato
	 * @param idade
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/**
	 * Este método pega o telefone do contato
	 * @return telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	
	/**
	 * Este método insere o telefone a um contato
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}

