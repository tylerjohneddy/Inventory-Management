package com.qa.project.five.week;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.MysqlConnection;

public class MysqlCustomerDao implements Dao<Customer>{

	

	public void create(Customer customer) {
		// TODO Auto-generated method stub
	}

	public ArrayList<Customer> readAll() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		String sql = "SELECT * FROM customers;";
		
		ResultSet resultSet = new Mysql().read(sql);
		try {
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String firstName = resultSet.getString("firstName");
				customers.add(new Customer(id, firstName));
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customers;
	}


	public void update(Customer customer, String newName) {
		// TODO Auto-generated method stub
		String sql = String.format("UPDATE customer SET name = %S WHERE name = %S;", customer.getFirstName(), newName);
		new Mysql().update(sql);

	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql = String.format("DELETE customer WHERE ID = %s;", id);
		new Mysql().delete(sql);

	}

	@Override
	public void update(Customer t) {
		// TODO Auto-generated method stub
		
	}

}
