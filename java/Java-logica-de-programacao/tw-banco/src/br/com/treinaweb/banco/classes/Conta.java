package br.com.treinaweb.banco.classes;

public class Conta {
	
	private String nome;
	private String email;
	private String telefone;
	private int agencia;
	private int conta;
	protected float saldo;
	private Boolean ativo;
	
	
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
	public String getEmail() {
		return email;
	}
	
	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getTelefone() {
		return telefone;
	}
	
	/**
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getAgencia() {
		return agencia;
	}
	
	/**
	 * 
	 * @param agencia
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	/**
	 * 
	 * @return
	 */
	public float getSaldo() {
		return saldo;
	}
	
	/**
	 * 
	 * @param saldo
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * 
	 * @return
	 */
	public Boolean getAtivo() {
		return ativo;
	}
	
	/**
	 * 
	 * @param ativo
	 */
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getConta() {
		return conta;
	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", agencia=" + agencia
				+ ", conta=" + conta + ", saldo=" + saldo + ", ativo=" + ativo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agencia;
		result = prime * result + ((ativo == null) ? 0 : ativo.hashCode());
		result = prime * result + conta;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Float.floatToIntBits(saldo);
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia != other.agencia)
			return false;
		if (ativo == null) {
			if (other.ativo != null)
				return false;
		} else if (!ativo.equals(other.ativo))
			return false;
		if (conta != other.conta)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Float.floatToIntBits(saldo) != Float.floatToIntBits(other.saldo))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}
	
	
}
