package com.qa.project.five.week.database;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.qa.project.five.week.tables.Order;

public class MysqlOrderDao implements Dao<Order> {

	@Override
	public void create(Order order) {
		String sql = String.format("INSERT INTO orders values(null,%s,%s,%s,now());", order.getCost(),
				order.getCustomerId(), order.getDiscount());
		new Mysql().create(sql);

	}

	@Override
	public ArrayList<String> readAll() {
		ArrayList<String> resultArray = new ArrayList<String>();
		String sql = "SELECT * FROM orders;";
		ResultSet resultSet = new Mysql().read(sql);
		Mysql mysql = new Mysql();
		resultArray = mysql.resultSetToArrayList(resultSet);
		for (String line : resultArray) {
			System.out.println(line);
		}

		return resultArray;
	}

	@Override
	public void update(Order t) {

	}

	@Override
	public void delete(int id) {

	}

}
