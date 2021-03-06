package br.edu.up;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Programa {

	public static void main(String[] args) throws SQLException {
		
		incluir();
		listar();
		
		
//		INSERT into cliente (nome, cpf, data_nasc, email)
//		VALUES ('Joao', '12345678998', '2000/10/03', 'joao@gmail.com')
		
//		select * from cliente
		
//		UPDATE cliente set email = 'pedro@hmail.com'
//				WHERE codigo = 1
		
//		DELETE from cliente WHERE codigo = 2


	}
	
	public static void listar() throws SQLException{
		
		String url = "jdbc:sqlite:C:\\_src\\ExSQLite\\db\\primeiro_banco.db";
		Connection conexao = DriverManager.getConnection(url);
		
		Statement comando = conexao.createStatement();
		String querySelect = "select * from cliente";
		ResultSet resultado = comando.executeQuery(querySelect);
		
		while(resultado.next()) {
			int codigo = resultado.getInt(1);
			String nome = resultado.getString(2);
			String cpf = resultado.getString(3);
			String dataNasc = resultado.getString(4);
			String email = resultado.getString(5);
			
			System.out.println("C?digo: " + codigo);
			System.out.println("Nome: " + nome);
			System.out.println("CPF: " + cpf);
			System.out.println("Data de nascimento: " + dataNasc);
			System.out.println("email: " + email);
			System.out.println("-------------------");
		
		}
	}
		
		public static void incluir() throws SQLException{
			
			String url = "jdbc:sqlite:C:\\_src\\ExSQLite\\db\\primeiro_banco.db";
			Connection conexao = DriverManager.getConnection(url);
			
			Statement comando = conexao.createStatement();
			String queryInsert = "INSERT into cliente (nome, cpf, data_nasc, email) " + " VALUES ('Joao', '12345678998', '2000/10/03', 'joao@gmail.com')";
			comando.execute(queryInsert);
		
		}
		
		public static void atualizar() throws SQLException{
			
			String url = "jdbc:sqlite:C:\\_src\\ExSQLite\\db\\primeiro_banco.db";
			Connection conexao = DriverManager.getConnection(url);
			
			Statement comando = conexao.createStatement();
			String queryUpdate = "UPDATE cliente set email = 'pedro@gmail.com'"
					+ " WHERE codigo = 1";
			comando.executeUpdate(queryUpdate);
		
		}
		
		public static void apagar() throws SQLException{
			
			String url = "jdbc:sqlite:C:\\_src\\ExSQLite\\db\\primeiro_banco.db";
			Connection conexao = DriverManager.getConnection(url);
			
			Statement comando = conexao.createStatement();
			String queryDelete = "DELETE from cliente WHERE codigo = 2";
			comando.execute(queryDelete);
		
		}
}
