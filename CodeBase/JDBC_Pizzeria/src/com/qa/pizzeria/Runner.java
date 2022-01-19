package com.qa.pizzeria;

public class Runner {
	
	public static void main(String[] args) {
		
		JDBC_Setup setup = new JDBC_Setup();
		setup.connect();
		
	}

}
