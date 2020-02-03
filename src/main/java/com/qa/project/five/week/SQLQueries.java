
package com.qa.project.five.week;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Tyler Eddy
 *
 */
public class SQLQueries extends Database {

	ResultSet rs = null;
	Statement stmt = null;
	String sql;

	/**
	 * @param name
	 * @return
	 */
	public boolean addCustomer(String name) {
		// -- Add a customer to the system
		sql = String.format("INSERT INTO customers values(null,%s);", name);
		
		return false;

	}

	/**
	 * @param name
	 * @param value
	 * @param quantity
	 * @return
	 */
	public boolean addItem(String name, float value, int quantity) {
//		-- Add an item to the system
		sql = String.format("INSERT INTO items VALUES(null,%s,%s,%s);", name, value, quantity);
		return false;
	}

	/**
	 * @return
	 */
	public boolean addOrder() {

//		-- Add an order to the system.
		sql = "INSERT INTO orders values(null,0.00,customer_id,0,now());";
		return false;
	}

	/**
	 * @return
	 */
	public boolean addItemToOrder() {

//		-- Add an item and quantity to an order.
		sql = "INSERT INTO item_order VALUES(null,order_id,item_id,quantity);";
		return false;
	}

	/**
	 * @param id
	 * @return
	 */
	public boolean deleteCustomer(int id) {

//		-- Delete a customer in the system.
		sql = String.format("DELETE customer WHERE id = %d;", id);
		return false;
	}

	/**
	 * @param name
	 * @return
	 */
	public boolean deleteCustomer(String name) {

//			-- Delete a customer in the system.
		sql = String.format("DELETE customer WHERE name = %s;", name);
		return false;
	}

	/**
	 * @param name
	 * @return
	 */
	public boolean deleteItem(String name) {

//		-- Delete an item in the system
		sql = String.format("DELETE FROM items WHERE name = %s;", name);
		return false;
	}

	/**
	 * @param id
	 * @return
	 */
	public boolean deleteItem(int id) {

//			-- Delete an item in the system
		sql = String.format("DELETE FROM items WHERE ID = %s;", id);
		return false;
	}

	/**
	 * @return
	 */
	public boolean deleteItemInOrder() {

//		-- Delete an item in the order
		sql = "DELETE FROM  item_order WHERE item_id = (SELECT id FROM item WHERE name = NAME OR ID = ID) AND order_id = ID;";
		return false;
	}

	/**
	 * @return
	 */
	public ResultSet viewAllItems() {

//		-- View all items in the system
		sql = "SELECT * FROM items;";
		return rs;
	}

	/**
	 * @return
	 */
	public ResultSet viewAllCustomers() {

//		-- View all customers in the system
		sql = "SELECT * FROM customers;";
		return rs;
	}

	/**
	 * @return
	 */
	public ResultSet viewAllOrders() {

//		-- View all orders in the system.
		sql = "SELECT * FROM orders;";
		return rs;
	}

	/**
	 * @param id       Unique ID for the item to be updated.
	 * @param name     The new name of the item.
	 * @param value    The new value of the item.
	 * @param quantity The new quantity of the item.
	 * @return Returns TRUE if the update was successful.
	 */
	public boolean updateItem(int id, String name, float value, int quantity) {

//		-- Update an item in the system
		sql = String.format("UPDATE items(name,value,quantity) set VALUES(%s,%s,%s) WHERE id=%s;", id, name, value,
				quantity);
		return false;
	}

	/**
	 * 
	 * @param quantity
	 * 
	 * @return
	 */
	public boolean updateItemInOrder(int quantity) {

//		-- Update the quantity of an item in an order
		sql = String.format("UPDATE item_order SET item_quantity  = %s;", quantity);
		return false;
	}

	/**
	 * @param currentName
	 * @param newName
	 * @return
	 */
	public boolean updateCustomer(String currentName, String newName) {
		// -- Update a customer in the system
		sql = String.format("UPDATE customer SET name = %S WHERE name = %S;", currentName, newName);
		return false;
	}

	/**
	 * @param id Requires Order ID to be passes to calculate a total
	 * @return
	 */
	public float orderCost(int id) {

//		-- Calculate a cost for an order.

		sql = String.format("SELECT SUM(item_quantity * sold_cost) where order_id = %s;", id);
		return 0;
	}

}
