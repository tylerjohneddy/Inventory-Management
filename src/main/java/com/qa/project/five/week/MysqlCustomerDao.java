package com.qa.project.five.week;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MysqlCustomerDao implements Dao<Customer> {

	private Connection connection;

	public MysqlCustomerDao() throws SQLException {

		this.connection = DriverManager.getConnection("jdbc:mysql://35.230.149.143:3306/ims", "root", "Everythingstopsforbakeoff");
	}

	public List<Customer> getAll() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from customer");
			while (resultSet.next()) {
				Long id = resultSet.getLong("id");
				String firstName = resultSet.getString("firstName");
				String surname = resultSet.getString("surname");
				customers.add(new Customer(id, firstName, surname));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return customers;
	}

	public void create(Customer customer) {
		// TODO Auto-generated method stub
	}

	public ArrayList<Customer> readAll() {
		// TODO Auto-generated method stub
		return null;	}

	public void update(Customer customer) {
		// TODO Auto-generated method stub

	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
