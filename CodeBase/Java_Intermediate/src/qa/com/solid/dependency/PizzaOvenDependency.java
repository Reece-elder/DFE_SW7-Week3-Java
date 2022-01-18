package qa.com.solid.dependency;

public class PizzaOvenDependency implements PizzaOrder {

	@Override
	public String cookPizza(PizzaDependency chosenPizza) {
		
		return "Pizza cooked!";
	}

}
