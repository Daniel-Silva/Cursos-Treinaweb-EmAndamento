package br.com.treinaweb.agenda.repositorios.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.treinaweb.agenda.entidades.Contato;
import br.com.treinaweb.agenda.fabricas.FabricaConexaoJdbc;
import br.com.treinaweb.agenda.repositorios.interfaces.RepositorioAgenda;

public class RepositorioContatoJdbc implements RepositorioAgenda<Contato> {

	@Override
	public List<Contato> selecionar() throws SQLException, IOException {

		List<Contato> contatos = new ArrayList<Contato>();
		// Criando conexão com o Banco de Dados
		try (Connection conexao = FabricaConexaoJdbc.criarConexao()) {
			Statement comando = conexao.createStatement(); // Permite disparar comandos SQL ao banco de dados
			ResultSet result = comando.executeQuery("SELECT * FROM T_CONTATOS");

			while (result.next()) {
				Contato contato = new Contato();
				contato.setId(result.getInt("id"));
				contato.setNome(result.getString("nome"));
				contato.setEmail(result.getString("email"));
				contato.setIdade(result.getInt("idade"));
				contato.setTelefone(result.getString("telefone"));
				contatos.add(contato);
			}
		} 
		return contatos;
	}

	@Override
	public void inserir(Contato entidade) throws SQLException, IOException{
		Connection conexao = null;
		try {
			conexao = FabricaConexaoJdbc.criarConexao();
			PreparedStatement comando = conexao.prepareStatement("INSERT INTO T_CONTATOS (nome, email, idade, telefone) VALUES (?, ?, ?, ?)");
			comando.setString(1, entidade.getNome());
			comando.setString(2, entidade.getEmail());
			comando.setInt(3, entidade.getIdade());
			comando.setString(4, entidade.getTelefone());
			comando.execute();
		} finally {
			if (conexao != null) {
				conexao.close();
			}
		}
	}

	@Override
	public void atualizar(Contato entidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Contato entidade) {
		// TODO Auto-generated method stub

	}

}
