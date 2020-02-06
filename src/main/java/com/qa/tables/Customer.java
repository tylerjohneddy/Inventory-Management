package com.qa.tables;

public class Customer {
	private int id;
	private String firstName;
	private String surname;

	public Customer(int id, String firstName, String surname) {
		this.id = id;
		this.firstName = firstName;
		this.surname = surname;
	}

	public Customer() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
