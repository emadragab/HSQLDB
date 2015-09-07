package com.lynda.javatraining.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
/*
	private static final String USERNAME = "dbuser";
	private static final String PASSWORD = "dbpassword";
	private static final String CONN_STRING =
			"jdbc:hsqldb:data/explorecalifornia";
	
	public static void main(String[] args) throws SQLException {
		
		//Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			System.out.println("Connected!");
		} catch (SQLException e) {
			System.err.println(e);
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
		
	}
*/
	
	private static final String usrname="dbuser";
	private static final String password="dbpassword";
	private static final String connection=
			"jdbc:hsqldb:data/explorecalifornia";
	public static void  main(String [] args) throws SQLException {
		Connection conn= null;
		try {
			conn=DriverManager.getConnection(connection, usrname, password);
			System.out.println("sucess conntection");
		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println(e);
		}finally {
			if (conn!=null) {
				conn.close();
			}
		}
		
	}
	
	

}
