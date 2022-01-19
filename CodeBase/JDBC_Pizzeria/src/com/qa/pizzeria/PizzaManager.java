package com.qa.pizzeria;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

// Will be responsible for handling all of our queries
public class PizzaManager {
	
	// Imported from JDBC - An object for our MySQL queries -> "Select * FROM pizzas"
	static Statement stmt;
	
	static Connection conn;
	
	// Create an object of our JDBC_Setup
	JDBC_Setup jdbc = new JDBC_Setup();
	
	
	// Method to post data to our MySQL DB
	public void addPizza(Pizza pizza) {
		try {
			// Try to connect and return the connection object
			conn = jdbc.connect();
			
			// Create a new statement USING the connection object
			stmt = conn.createStatement();
			
			// Create a query to put into our statement
			// Eventually we will replace VALUES(pizza.type, pizza.slices) 
			String query = "INSERT INTO pizzas (type, slices, stuffedCrust) VALUES('Pepperoni', 12, true)";
			
			// Using our statement object, we need to run the query 
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
