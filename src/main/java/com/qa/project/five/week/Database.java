package com.qa.project.five.week;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.Query;

import java.sql.ResultSet;

/**
 * @author Tyler Eddy
 *
 */
public class Database {
	private static final String DB_URL = "jdbc:mysql://35.230.149.143/inventory_management";

	// Database credentials
	private static final String USER = "javaDriver";
	private static final String PASS = "i-am-gROOT";

	Statement stmt = null;
	Connection conn = null;
	ResultSet rs = null;

	/**
	 * @return Once run this provides connection object to the database to be used
	 *         with all activities.
	 * @throws SQLException
	 */
	public Connection connect() throws SQLException {
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		return conn;

	}

	/**
	 * @param conn
	 * @param sql
	 */
	public void create(Connection conn, String sql) {
		try {
			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			// conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// conn = new Database().Connect();

			// STEP 4: Execute a query
			// System.out.println("Creating database...");
			stmt = conn.createStatement();

			stmt.executeUpdate(sql);
			System.out.println("Created successfully...");
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
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

	}
	public void update(Connection conn, String sql) {
		
	}
	public void delete(Connection conn, String sql) {
		
	}
	public ResultSet select(Connection conn, String sql) throws SQLException {

		try {

		
			ResultSet rs = conn.createStatement().executeQuery(sql);
			return rs;
	

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
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
		return rs;
	}

	public String resultSet_toString(ResultSet rs) {
		String Result = "";
		try {
			
			while (rs.next()) {
				String row = "";
				for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					row += rs.getMetaData().getColumnLabel(i) + " , " + rs.getString(i) + " ";
				}
				Result += row + "\n";
			}
		} catch (SQLException e) {
			Result = "null";
		}
		return Result;
	}

}