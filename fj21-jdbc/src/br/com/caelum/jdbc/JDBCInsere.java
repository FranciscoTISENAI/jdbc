package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			// conectando
			con = new ConnectionFactory().getConnection();
			// cria um preparedStatement
			String sql = "insert into contatos"+" (nome,email,endereco,dataNascimento)"+" values (?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			// preenche os valores
			stmt.setString(1, "Francisco Ferreira");
			stmt.setString(2, "francisco.ferreira@ma.docente.senai.br");
			stmt.setString(3, "Rua Loreto, SN. Hélio Queiroz");
			stmt.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
			// executa
			stmt.execute();
			stmt.close();
			System.out.println("Gravado!");
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			con.close();
		}
		

	}

}
