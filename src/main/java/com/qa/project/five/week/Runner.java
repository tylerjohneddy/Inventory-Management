package com.qa.project.five.week;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @author Tyler Eddy
 *
 */
public class Runner {

	public static void main(String[] args) {

		// JDBC driver name and database URL

		Database IMS = new Database();
		try {
			IMS.create(IMS.connect(), "Select *");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Goodbye!");
	}// end main
}// end Runner
