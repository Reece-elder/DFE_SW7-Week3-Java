package qa.com.designPattern.strategy;

// Our class to swap the strategies (red, green blue)
public class StrategySwapper {
	
	// The interface they all implement
	private ColourPrint colour;
	
	public void setColour(ColourPrint colour) {
		this.colour = colour;
	}
	
	public String print(String shape) {
		// Access the strategy we've set (red, green or blue)
		// Run the printshape method of that strategy, passing in the String
		return colour.printShape(shape);
	}

}
