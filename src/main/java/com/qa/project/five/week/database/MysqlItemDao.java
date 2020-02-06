package com.qa.project.five.week;

import java.util.ArrayList;

public class MysqlItemDao implements Dao<Item> {

	@Override
	public void create(Item item) {
		// TODO Auto-generated method stub
		String sql = String.format("INSERT INTO items VALUES(null,%s,%s,%s);", item.getName(), item.getValue(),item.getInStock());
		new Mysql().create(sql);
		
	}

	@Override
	public ArrayList<Item> readAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM items;";
		new Mysql().read(sql);
		
		return null;
	}

	@Override
	public void update(Item t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql = String.format("DELETE FROM items WHERE ID = %s;", id);

	}

}
