package com.dachser.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		/*
		 * Connection with Docker MySql container:
		 * serverIP: localhost
		 * -----------------------
		 * root username: root
		 * root password: my-pass
		 *-------------------------
		 * username: user-name
		 * password: my-user-pass
		 * ------------------------
		 * default Database name: default_db
		 * 
		 * */
		
		String serverIP = "mysql://localhost";
		String dbUsername="user-name";
		String dbPassword="my-user-pass";
		String dbName="default_db";

		String jdbcUrl = "jdbc:"+serverIP+":3306/"+dbName+"?useSSL=false&serverTimezone=UTC";
		
		try {
			// this test just to throw an exception if the connection not success.
			Connection conn = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
			System.out.println("Connection Successfull with: " + jdbcUrl);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Faild to connect with MySql server!");
		}

	}

}
