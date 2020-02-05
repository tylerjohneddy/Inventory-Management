package com.qa.project.five.week;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Tyler Eddy
 *
 */
public class Runner {

	public static void main(String[] args) {
		try {
			new Mysql().connect();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could not connect to database, check connection configuration");
		}

		new Menu();
		
		new Mysql().close();

	}// end main
}// end Runner
