package com.qa.jdbc_example;

import java.util.Objects;

/**
 * User is a domain object (represents the target business domain), also represents the entity in our database
 * @author Morgan Walsh
 *
 */
public class User {

	private long id;
	private String forename;
	private String surname;
	private int age;
	
	public User() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// hashCode is used internally by certain data structures to optimise access times to data
	// - this is in structures such as HashMaps and HashSets
	@Override
	public int hashCode() {
		return Objects.hash(age, forename, id, surname);
	}

	// we use this for comparing two objects to see if they are equal, do their fields
	// contain the same data, very important for testing
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(forename, other.forename) && id == other.id
				&& Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", forename=" + forename + ", surname=" + surname + ", age=" + age + "]";
	}
	
	
}