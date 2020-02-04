package com.qa.project.five.week;

public class Customer {
	private Long id;
	private String firstName;
	private String surname;

	public Customer(Long id2, String firstName2, String surname2) {
		// TODO Auto-generated constructor stub
		this.id = id2;
		this.firstName = firstName2;
		this.surname = surname2;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
