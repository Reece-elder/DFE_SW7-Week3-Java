package com.qa.pizzeria;

public class Runner {
	
	public static void main(String[] args) {
		
		JDBC_Setup setup = new JDBC_Setup();
		setup.connect();
		
		Pizza pepperoni = new Pizza("Pepperoni", 10, true);
		PizzaManager manager = new PizzaManager();
		
		// the addPizza method is not using the passed in pizza
		// But requires it being passed in to run
		
		manager.addPizza(pepperoni);
		
	}

}
