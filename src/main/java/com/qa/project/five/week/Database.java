package com.qa.project.five.week;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.Query;

import java.sql.ResultSet;

public class Database {
	private static final String DB_URL = "jdbc:mysql://35.230.149.143/mysql";

	// Database credentials
	private static final String USER = "javaDriver";
	private static final String PASS = "i-am-gROOT";
	
	Connection conn = null;

	public Connection Connect() throws SQLException {
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		return conn;

	}

}