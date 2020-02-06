package com.qa.database;

import java.util.ArrayList;
import java.util.List;

import com.qa.tables.Item;

public class MysqlItemDao implements Dao<Item> {

	@Override
	public void create(Item item) {
		String sql = String.format("INSERT INTO items VALUES(null,%s,%s,%s);", item.getName(), item.getValue(),item.getInStock());
		new Mysql().create(sql);
		
	}

	@Override
	public List<String> readAll() {
		String sql = "SELECT * FROM items;";
		new Mysql().read(sql);
		
		return null;
	}

	@Override
	public void update(Item item) {
		String sql = String.format("UPDATE items(name,value,quantity) set VALUES(%s,%s,%s) WHERE id=%s;", item.getId(), item.getName(), item.getValue(),
				item.getInStock());
		new Mysql().update(sql);
		

	}

	@Override
	public void delete(int id) {
		String sql = String.format("DELETE FROM items WHERE ID = %s;", id);
		new Mysql().delete(sql);
		

	}

}
