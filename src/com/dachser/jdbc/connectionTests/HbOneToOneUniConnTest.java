package com.dachser.jdbc.connectionTests;

import java.sql.Connection;
import java.sql.DriverManager;

public class HbOneToOneUniConnTest {

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
		String dbUsername="root";
		String dbPassword="my-pass";
		String dbName="hb-01-one-to-one-uni";

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
