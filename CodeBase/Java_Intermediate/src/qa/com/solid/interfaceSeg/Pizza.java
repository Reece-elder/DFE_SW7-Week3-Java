package qa.com.solid.interfaceSeg;

// Interface segregation - Not forcing classes which implement interfaces to have unnecessary methods
// When a class implements/extends a class it should be using ALL abstract methods
// ONLY necessary / beneficial methods are inherited by an abstract or an interface

public class Pizza implements veganCheese, deepPan {

	@Override
	public String veganCheese() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deepPan() {
		// TODO Auto-generated method stub
		return null;
	}

}
