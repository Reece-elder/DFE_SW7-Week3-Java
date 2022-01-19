package com.qa.pizzeria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Setup {
	
	// Ctrl Shift O
	// Variables to connect to our database
	// Driver is a piece of software to aid communication from one node to another
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	// the db_url we will be connecting to the database we created earlier 
	final String db_url = "jdbc:mysql://localhost:3306/pizzeria";
	
	// Adding our Database credentials 
	final String user = "root";
	final String password = "root";
	
	// Create a connection object and set it to null
	Connection conn = null; 
	
	
	// Method to connect to our database
	public Connection connect() {
		
		// Try Catch block uses Try + Catch - Attempt to do something (outside of Java Control)
		// If it is unsuccesful, what do you wanna do
		// Try - You want the code to attempt to do
		// Catch - What happens if the try was unsuccesful 
		
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(db_url, user, password);
			System.out.println("Connected to Database!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	

}
