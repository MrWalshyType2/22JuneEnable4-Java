package com.qa.examples.maven_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Runner {

	public static void main(String[] args) throws SQLException {
		System.out.println("Hello world");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airport", "root", "root");
	}

}
