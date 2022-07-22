package com.qa.jdbc_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Runner {

	// IPv4 & IPv6:
	// - Internet Protocol
	// - localhost is a specially reserved IPv4 address, it stands for 127.0.0.1
	// - localhost points to your computer
	// - localhost is also known as the local loopback address
	
	// Setup variables for connecting to local MySQL instance
	// - Connection string format: jdbc:vendor://url:port/databaseName?parameters
	//
	// - these normally come from some environment variables or a protected config
	// file, they are
	// never stored in the application itself or in a public location in production
	// systems
	private static final String connectionUrl = "jdbc:mysql://localhost:3306/example?serverTimezone=UTC";
	private static final String username = "root";
	private static final String password = "root";

	// Database transaction steps:
	// 1. Get connection object which allows you to talk to the database
	// 2. Create and prepare an SQL statement for execution against the database
	// 3. Execute the SQL statement and store the results in a variable
	// 4. If it is a result set, unwrap that result set into its values where
	// a ResultSet is just a Java object representing a database table and its
	// results
	// 5. Close the connection

	// In enterprise systems, we don't usually close the connection straight away.
	// It instead often goes to
	// something called a connection pool, a connection pool holds multiple
	// connection objects which
	// can be used by the application.

	public static void main(String[] args) {
		// Connection is from java.sql, it's part of the JDBC API
		Connection conn = null;

		try {
			// 1. open the connection
			conn = getConnection();

			// 2. through .4
			List<User> users = findAll(conn);

			for (User user : users) {
				System.out.println(user);
			}

//				users.forEach(System.out::println);
			// users.forEach(user -> System.out.println(user));

		} catch (SQLException e) {
			System.err.println("Something went wrong during the transaction");
		} finally {
			// a finally block always executes regardless of what happened in the try or the catch blocks
			try {
				// 5.
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("Something went wrong closing the connection");
			}
		}
	}

	private static Connection getConnection() throws SQLException {
		// DriverManager is part of the JDBC API
		// - getConnection() returns a connection object
		return DriverManager.getConnection(connectionUrl, username, password);
	}

	private static List<User> findAll(Connection conn) throws SQLException {
		// 2. Statement is part of the JDBC API
		Statement stmt = conn.createStatement();

		// 3. ResultSet is part of the JDBC API
		// - executeQuery() is for executing SELECT statements,
		// only statements which do not modify the state of the database
		final String sql = "SELECT * FROM user";
		ResultSet rs = stmt.executeQuery(sql);

		// 4.
		List<User> users = unwrapSet(rs);

		return users;
	}
	
	private static List<User> unwrapSet(ResultSet rs) throws SQLException {
		List<User> users = new ArrayList<>();

		// iterate over the result set until nothing is left
		// - call rs.next() to move the pointer in the result set to the next location
		// (think of it like how you iterate through a list, how the index goes up)
		// except that the first time we call .next(), it makes the pointer point to the
		// first item in that result set
		while (rs.next()) {
			User user = unwrap(rs); // get a user out of the result set
			users.add(user); // add them to a list for returning after
		}
		return users;
	}

	private static User unwrap(ResultSet rs) throws SQLException {
		// ResultSets start 1 position before our entities
		// - this means we need to call rs.next() once before it points at the first
		// entity
		User user = new User();

		// use a getXXXX() method to retrieve data, pass in the field name as a
		// parameter
		// - if we use indexes for rs.getXXXX(), they start counting from 1 instead of 0
		// like an array
		Long id = rs.getLong("id"); // long in MySQL is BIGINT
		String forename = rs.getString("forename");
		String surname = rs.getString("surname");
		int age = rs.getInt("age");

		user.setId(id);
		user.setForename(forename);
		user.setSurname(surname);
		user.setAge(age);
		return user;
	}

}
