package com.qa.database;

import java.sql.ResultSet;
import java.util.List;

import com.qa.tables.Customer;

public class MysqlCustomerDao implements Dao<Customer>{

	

	/**
	 *
	 */
	public void create(Customer customer) {
		String sql = String.format("INSERT INTO customers values(null,'%s','%s');", customer.getFirstName(), customer.getSurname());
		new Mysql().create(sql);
	}

	
	public List<String> readAll() {
		
		Mysql mysql = new Mysql();
		String sql = "SELECT * FROM customers;";
		
		ResultSet resultSet =  mysql.read(sql);
		return mysql.resultSetToArrayList(resultSet);

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
