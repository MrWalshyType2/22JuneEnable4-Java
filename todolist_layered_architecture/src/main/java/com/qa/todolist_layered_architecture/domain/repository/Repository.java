package com.qa.todolist_layered_architecture.domain.repository;

import java.util.List;

// T represents the type of the data
// U represents the type of the data's id field
public interface Repository<T, U> {

	T save(T obj);
	List<T> read();
	void update(T obj);
	boolean delete(U id);
}
