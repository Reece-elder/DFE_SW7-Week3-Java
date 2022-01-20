package qa.com.designPattern.adapter;

// Class that extends off of roundPeg
// Convert Squarepeg to a hybrid of roundpeg

public class SquarePegAdapter extends RoundPeg {
	
	private SquarePeg peg;
	
	public SquarePegAdapter(SquarePeg peg) {
		this.peg = peg;
	}
	
	// Overriding the getRadius for round peg
	// When we run get radius for square peg converts it
	// so round hole can run the code
	
	@Override
	public int getRadius() {
		int radius;
		
		radius = (peg.getWidth() / 2);
		
		return radius;
	}
	
	

}
