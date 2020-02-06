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
public class Mysql {
	private static final String DB_URL = "jdbc:mysql://35.230.149.143/inventory_management";

	// Database credentials
	private static final String USER = "javaDriver";
	private static final String PASS = "i-am-gROOT";

	private static Connection conn = null;

	private static Statement stmt = null;
	private static ResultSet rs = null;

	/**
	 * @return Once run this provides connection object to the database to be used
	 *         with all activities.
	 * @throws SQLException
	 */
	public void connect() throws SQLException {

		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		stmt = conn.createStatement();

	}

	public void checkDatabase() {

	}

	/**
	 * @param conn
	 * @param sql
	 */
	public void create(String sql) {

		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ResultSet read(String sql) {
		
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	public void update(String sql) {
		
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void delete(String sql) {
		
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

	public void close() {
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

	}

}