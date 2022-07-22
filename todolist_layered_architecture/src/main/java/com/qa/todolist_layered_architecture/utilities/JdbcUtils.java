package com.qa.todolist_layered_architecture.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {

	private String connectionUrl; // jdbc:vendor://url:port/databaseName?parameters
	private String username;
	private String password;
	
	private JdbcUtils(String connectionUrl, String username, String password) {
		super();
		this.connectionUrl = connectionUrl;
		this.username = username;
		this.password = password;
	}
	
	private static JdbcUtils utils;
	
	//Connection connection = JdbcUtils.getConnection();
	public static Connection getConnection() throws SQLException {
		if (JdbcUtils.utils == null) {
			JdbcUtils.utils = new JdbcUtils("jdbc:mysql://localhost:3306/todolist?serverTimezone=UTC","root","root");
		}
		// use DriverManager.getConnection to get a connection to a database
		// - in this case, a locally hosted mysql server
		return DriverManager.getConnection(JdbcUtils.utils.connectionUrl, JdbcUtils.utils.username, JdbcUtils.utils.password);
	}
	
	public static Connection getConnection(String connectionUrl, String username, String password) throws SQLException {
		return DriverManager.getConnection(connectionUrl, username, password);
	}
}
