package br.com.treinaweb.mercado.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteCrudEstatico {

	public static void main(String[] args) {
		
		try {

			Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "ThirdDay");
			System.out.println("Conectado!");
			
			
			
			Statement stmt = conexao.createStatement();
			stmt.executeUpdate("INSERT INTO T_PRODUTO (CD_PRODUTO, NM_PRODUTO, VL_PRODUTO, DT_VALIDADE)" +
								" VALUES (SQ_T_PRODUTO.NEXTVAL, 'Laranja', 5.99, TO_DATE('28/12/2018', 'DD/MM/YYYY'))");

			String sqlUpdate = "UPDATE T_PRODUTO SET VL_PRODUTO = 12.99 WHERE CD_PRODUTO = 1";
			stmt.executeQuery(sqlUpdate);
			
			ResultSet result = stmt.executeQuery("SELECT * FROM T_PRODUTO");
					
			while(result.next()) {
				System.out.println(	result.getInt("CD_PRODUTO") + " " +
									result.getString("NM_PRODUTO") + " " +
									result.getDouble("VL_PRODUTO") + " " +
									result.getDate("DT_VALIDADE"));
			}
			
			conexao.close();

		} catch (SQLException e) {
			System.err.print("Não foi possível conectar no ORACLE FIAPON");
			e.printStackTrace();
		}
	}

}
