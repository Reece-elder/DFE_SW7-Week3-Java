package qa.com.designPattern.builder;

public class PizzaBuilder {
	
	// Are gonna be the fields that are passed in, as well as default values if wanted
	private String cheese = "mozzerella"; 
	private String crust = "stuffed"; 
	private int size; // size doesnt have a default value
	private String sauce = "tomato";
	
	// Creating pizzabuilder object
	public PizzaBuilder(){}
	
	// Returning our fully made pizza, will be called last
	public Pizza buildPizza() {
		return new Pizza(cheese, crust, size, sauce);
	}
	
	// Used to set the values of our PizzaBuilder class
	// Takes in a string called passedCheese
	public PizzaBuilder cheese(String passedCheese) {
		//	sets the value of the builders cheese to the passed in value
		this.cheese = passedCheese;
		return this;
	}
	
	public PizzaBuilder size(int passedSize) {
		this.size = passedSize;
		return this;
	}

}
