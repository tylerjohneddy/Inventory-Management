package com.qa.project.five.week;

import java.sql.ResultSet;
import java.sql.Statement;



public class SQLQueries extends Database{

		ResultSet rs = null;
		Statement stmt = null;
		String sql;

		public boolean addCustomer(String name) {
			// -- Add a customer to the system
			sql = "INSERT INTO customers values(null,NAME);";
			return false;

		}

		public ResultSet viewAllCustomers() {

//		-- View all customers in the system
			sql = "SELECT * FROM customers;";
			return rs;
		}

		public boolean updateCustomer(String currentName, String newName) {
			// -- Update a customer in the system
			sql = String.format("UPDATE customer SET name = %S WHERE name = %S;", currentName, newName);
			return false;
		}

		public boolean deleteCustomer(int id) {

//		-- Delete a customer in the system.
			sql = String.format("DELETE customer WHERE id = %d;", id);
			return false;
		}

		public boolean deleteCustomer(String name) {

//			-- Delete a customer in the system.
			sql = String.format("DELETE customer WHERE name = %s;", name);
			return false;
		}

		public boolean addItem(String name, float value, int quantity) {
//		-- Add an item to the system
			sql = String.format("INSERT INTO items VALUES(null,name,value,quantity);");
			return false;
		}

		public ResultSet viewAllItems() {

//		-- View all items in the system
			sql = "SELECT * FROM items;";
			return rs;
		}

		public boolean updateItem() {

//		-- Update an item in the system
			sql = "UPDATE items(name,value,quantity) set VALUES(name,value,quantity) WHERE id=ID;";
			return false;
		}

		public boolean deleteItem() {

//		-- Delete an item in the system
			sql = "DELETE FROM items WHERE name = NAME OR  ID = ID;";
			return false;
		}

		public boolean addItemToOrder() {

//		-- Add an item and quantity to an order.
			sql = "INSERT INTO item_order VALUES(null,order_id,item_id,quantity);";
			return false;
		}

		public float orderCost() {

//		-- Calculate a cost for an order.

			sql = "SELECT SUM(item_quantity * sold_cost) where order_id = ID;";
			return 0;
		}

		public boolean updateItemInOrder() {

//		-- Update the quantity of an item in an order
			sql = "UPDATE item_order SET item_quantity  = NEW_ITEM_QUANTITY; ";
			return false;
		}

		public boolean deleteItemInOrder() {

//		-- Delete an item in the order
			sql = "DELETE FROM  item_order WHERE item_id = (SELECT id FROM item WHERE name = NAME OR ID = ID) AND order_id = ID;";
			return false;
		}

		public boolean addOrder() {

//		-- Add an order to the system.
			sql = "INSERT INTO orders values(null,0.00,customer_id,0,now());";
			return false;
		}

		public ResultSet viewAllOrders() {

//		-- View all orders in the system.
			sql = "SELECT * FROM orders;";
			return rs;
		}

	}


