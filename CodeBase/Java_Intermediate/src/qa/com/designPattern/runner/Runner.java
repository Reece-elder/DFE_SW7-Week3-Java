package qa.com.designPattern.runner;

import qa.com.designPattern.builder.Pizza;
import qa.com.designPattern.builder.PizzaBuilder;

public class Runner {
	
	public void builder() {
		
		Pizza pepperoni = new PizzaBuilder().size(12).buildPizza();
		
	}

}
