package com.qa.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.qa.ims.Runner;


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
		
		Runner.LOGGER.info("Connecting to database...");
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
			e.printStackTrace();
		}
	}

	/**
	 * @param sql
	 * @return
	 */
	public ResultSet read(String sql) {

		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * @param sql
	 */
	public void update(String sql) {

		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param sql
	 */
	public void delete(String sql) {

		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param rs
	 * @return
	 */
	public List<String> resultSetToArrayList(ResultSet rs) {
		List<String> results = new ArrayList<String>();

		try {

			while (rs.next()) {
				String row = "";
				for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					row += rs.getMetaData().getColumnLabel(i) + " , " + rs.getString(i) + " ";
				}
				results.add(row);
			}
		} catch (SQLException e) {
			results.add("\nerror\n");
		}
		return results;
	}

	/**
	 * 
	 */
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