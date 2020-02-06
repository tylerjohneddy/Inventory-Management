package com.qa.ims;

import java.sql.Connection;
import org.apache.log4j.ConsoleAppender;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.qa.database.*;
import com.qa.tables.Customer;
import com.qa.tables.Menu;
import com.qa.tables.Order;

/**
 * @author Tyler Eddy
 *
 */
public class Runner {

	public static final Logger LOGGER= Logger.getLogger(Runner.class); 
	
	public static void main(String[] args) {

		new Menu();

		new Mysql().close();

	}// end main
}// end Runner
