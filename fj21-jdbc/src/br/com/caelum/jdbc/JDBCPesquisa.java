package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPesquisa {

	public static void main(String[] args) throws SQLException {
		// pega a conexão e o Statement
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = con.prepareStatement("select * from contatos");
		// executa um select
		ResultSet rs = stmt.executeQuery();
		// itera no ResultSet
		while (rs.next()) {
		String id = rs.getString("id");
		String nome = rs.getString("nome");
		String email = rs.getString("email");
		System.out.println(id +" - "+nome + " _ " + email);
		}
		stmt.close();
		con.close();

	}

}
