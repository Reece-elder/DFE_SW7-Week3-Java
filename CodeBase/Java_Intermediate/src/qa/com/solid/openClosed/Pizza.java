package qa.com.solid.openClosed;

public class Pizza {
	
	private String toppings;
	private int size;
	private boolean stuffedCrust;
	
	public Pizza(String toppings, int size, boolean stuffedCrust) {
		super();
		this.toppings = toppings;
		this.size = size;
		this.stuffedCrust = stuffedCrust;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isStuffedCrust() {
		return stuffedCrust;
	}

	public void setStuffedCrust(boolean stuffedCrust) {
		this.stuffedCrust = stuffedCrust;
	}
	
	public String cookPizza() {
		return "Pizza cooked";
	}
	
	

}
