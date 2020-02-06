package com.qa.project.five.week.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.MysqlConnection;
import com.qa.project.five.week.tables.Customer;

public class MysqlCustomerDao implements Dao<Customer>{

	

	/**
	 *
	 */
	public void create(Customer customer) {
		String sql = String.format("INSERT INTO customers values(null,'%s','%s');", customer.getFirstName(), customer.getSurname());
		new Mysql().create(sql);
	}

	
	public ArrayList<String> readAll() {
		//ArrayList<String> customers = new ArrayList<String>();
		Mysql mysql = new Mysql();
		String sql = "SELECT * FROM customers;";
		
		ResultSet resultSet =  mysql.read(sql);
		//customers = mysql.resultSetToArrayList(resultSet);
		return mysql.resultSetToArrayList(resultSet);
				
		


		//return customers;
	}


	public void update(Customer customer) {
		String sql = String.format("UPDATE customer SET id = %S WHERE name = %S;",customer.getId(), customer.getFirstName());
		new Mysql().update(sql);

	}

	public void delete(int id) {
		String sql = String.format("DELETE customer WHERE ID = %s;", id);
		new Mysql().delete(sql);

	}

}
