package com.qa.pizzeria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			String query = "INSERT INTO pizzas (type, slices, stuffedCrust) "
					// VALUES('Pepperoni', 12, true) Has to match exactly					
					+ "VALUES('" + pizza.getType() + "', " + pizza.getSlices() + " , " + pizza.isStuffedCrust() + ")";
			
			// Using our statement object, we need to run the query 
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Creating a view all query to send to the database
	// Implementing a way to read the data JDBC sends us
	
	public Pizza viewPizza(long id) {
		
		try {
			conn = jdbc.connect();
			stmt = conn.createStatement();
			String query = "SELECT * FROM pizzas WHERE id = " + id;
			ResultSet result = stmt.executeQuery(query);
			// Our result is a spreadsheet from the database, with the first row being meta data
			// Go down to the next row of data (Our useful data) 
			result.next();
			// Pass in the useful data to our returnResults method, return this
			return jdbc.returnResults(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public void viewAllPizzas() {
		try {
			conn = jdbc.connect();
			stmt = conn.createStatement();
			String query = "SELECT * FROM pizzas";
			// result - All objects from our database
			ResultSet result = stmt.executeQuery(query);
			
			// While result.next() = true {do this thing}
			// result ISNT an array 
			// NOT SAYING Loop through the array and print out each document
			// result = a spreadsheet, change the row we're focusing on 
			while(result.next()) {
				System.out.println(jdbc.returnResults(result));
			};
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Query - Reading data 
	// Update - Modifying data (Read, delete, create)
	
	// Prepared Statements - nicer ways of making longer queries
	public void deletePizza(long id) {
		try {
			conn = jdbc.connect();
			
			// Prepared statements use SQL ? Syntax
			// ? relates to a variable we can pass in
			PreparedStatement preStmt = conn.prepareStatement("DELETE FROM pizzas where id = ?");
			
			// Find the first ? set its value to be a Long with a value of <id>
//			preStmt.setString(1, "id");
			preStmt.setLong(1, id);
			
			// Execute the statement
			preStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Pizza updatePizza(long id, Pizza pizza) {
		try {
			conn = jdbc.connect();
			String update = "UPDATE pizzas SET type = ?, slices = ?, stuffedCrust = ? WHERE id = ?";
			PreparedStatement preStmt = conn.prepareStatement(update);
			preStmt.setString(1, pizza.getType());
			preStmt.setInt(2, pizza.getSlices());
			preStmt.setBoolean(3, pizza.isStuffedCrust());
			preStmt.setLong(4, id);
			
			preStmt.executeUpdate();
			return viewPizza(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	

}
