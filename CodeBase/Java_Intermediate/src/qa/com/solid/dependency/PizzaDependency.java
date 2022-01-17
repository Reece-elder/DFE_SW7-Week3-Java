package qa.com.solid.dependency;

public class PizzaDependency {
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PizzaDependency(String type) {
		super();
		this.type = type;
	}
	
	public void cookPizza(PizzaOrder order) {
		// Takes in a type of pizza order
		// Passes in this object (the pizza) 
		// into the cookPizza function in the interface
		order.cookPizza(this);
	}
	
	

}
