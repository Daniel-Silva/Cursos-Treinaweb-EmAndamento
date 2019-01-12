package br.com.fiap.mercado.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public static Connection obterConexao() {
		Connection conexao = null;
		try {
			//Abre uma conexão
		     conexao = DriverManager.getConnection(
		    		  "jdbc:oracle:thin:@localhost:1521:XE", "system", "ThirdDay");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conexao;
	}
	
}
