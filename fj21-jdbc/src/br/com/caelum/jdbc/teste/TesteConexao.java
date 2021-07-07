package br.com.caelum.jdbc.teste;


import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) {
		
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
