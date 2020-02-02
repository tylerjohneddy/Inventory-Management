package com.qa.project.five.week;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64.Encoder;

public class Runner {
	public static void main(String[] args) {
		  final String DB_URL = "jdbc:mysql://35.230.149.143/mysql?";

		// Database credentials
		  final String USER = "javaDriver";
		  final String PASS = "i-am-gROOT";
		// JDBC driver name and database URL
		Connection conn = null;
		Statement stmt = null;
		Database conn1 = new Database();
		try {
			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			//conn = DriverManager.getConnection(DB_URL, USER, PASS);
			

			// STEP 4: Execute a query
			System.out.println("Creating database...");
			stmt = conn1.Connect().createStatement();

			String sql = "";
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main
}// end JDBCExampl
