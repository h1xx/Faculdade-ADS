package br.com.unisenai.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static Connection connection;
	private static final String URL = "jdbc:h2:./data/provadb";
	private static final String USER = "sa";
	private static final String PASSWORD = "java";
	static {
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Não foi possível carregar o Driver do banco H2");
		}
	}

public static Connection getConnection() throws SQLException {
try {
if(connection == null || connection.isClosed()) {

connection = DriverManager.getConnection(URL, USER, PASSWORD);
	}
} catch (SQLException e) {
System.out.println("Não foi possível realizar a conexão com o banco de dados");
throw e;
		}
return connection;
	}
}
