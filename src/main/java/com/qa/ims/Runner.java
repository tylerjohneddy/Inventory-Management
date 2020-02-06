package com.qa.ims;

import java.sql.Connection;
import org.apache.log4j.ConsoleAppender;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.qa.project.five.week.database.*;
import com.qa.project.five.week.tables.Customer;
import com.qa.project.five.week.tables.Menu;
import com.qa.project.five.week.tables.Order;

/**
 * @author Tyler Eddy
 *
 */
public class Runner {

	public static final Logger LOGGER= Logger.getLogger(Runner.class); 
	
	public static void main(String[] args) {
		LOGGER.info("kjhjkhjk");
		LOGGER.warn("kjhjkhjk");
//		try {
//			Mysql mysql = new Mysql();
//			mysql.connect();
//			Customer customer = new Customer(0, "Tyler", "Eddy");
//			new MysqlCustomerDao().create(customer);
//			Order order = new Order(0, 1, 0);
//			new MysqlOrderDao().create(order);
//			new MysqlOrderDao().readAll();
////			throw new SQLException();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("Could not connect to database, check connection configuration");
//		}
//
//		new Menu();

		new Mysql().close();

	}// end main
}// end Runner
