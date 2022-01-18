package qa.com.designPattern.adapter;

// Adapter class allows incompatible classes to communicate
// Converts the interface / methods of one object to allow it to work in another

// Round peg will fit in the round hole
// Square peg wont fit until we adapt it to fit

public class RoundHole {
	
	private int radius;

	public RoundHole(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// Some method which checks if the peg will fit in the hole
	public boolean checksFit(RoundPeg peg) {
		boolean result; 
		// If the hole is bigger (or equal size) to peg it will return true
		result = (this.getRadius() >= peg.getRadius());
		return result;
	}
	
	
	
	

}
