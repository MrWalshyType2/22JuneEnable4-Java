package com.qa.todolist_layered_architecture.domain.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.qa.todolist_layered_architecture.domain.entity.Todo;
import com.qa.todolist_layered_architecture.utilities.JdbcUtils;

public class TodoRepository implements Repository<Todo, Long> {

	public TodoRepository() {

	}

	@Override
	public Todo save(Todo todo) {
		// a question mark is a placeholder for a bind variable
		String sql = "INSERT INTO todo(name, dueDate) VALUES(?,?);";

		try (Connection conn = JdbcUtils.getConnection(); 
			 PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			// a prepared statement has data inserted counting from 1
			// - each bind variable in the sql has an associated number, starting from 1 for the first ?
			ps.setString(1, todo.getName());
			ps.setDate(2, Date.valueOf(todo.getDueDate()));
			
			// executeUpdate() is used for INSERT, UPDATE and DELETE SQL statements
			// executeQuery() for SELECT
			try {
				int modifiedCount = ps.executeUpdate();
				
				if (modifiedCount > 0) {
					// if modified count was greater than 0, a result set will also be returned containing
					// any generated ids
					ResultSet keys = ps.getGeneratedKeys();
					
					if (keys.next()) {
						todo.setId(keys.getLong(1));
						return todo;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Todo> read() {
		List<Todo> todoItems = new ArrayList<>();

		// try-with-resources
		// - rather than using a finally block to close resources, if they implement the
		// AutoCloseable interface
		// we can use a specialised try-catch block
		try (Connection conn = JdbcUtils.getConnection(); Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT * FROM todo");

			while (rs.next()) {
				todoItems.add(unwrap(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return todoItems;
	}

	@Override
	public void update(Todo todo) {

	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private Todo unwrap(ResultSet rs) throws SQLException {
		long id = rs.getLong("id");
		String name = rs.getString("name");
		Date date = rs.getDate("dueDate");

		return new Todo(id, name, date.toLocalDate());
	}

	
}
