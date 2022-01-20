package qa.com.designPattern.strategy;

// Strategy Pattern - Allows multiple implementations of a class at run time
// Allows us to specify what type of strategy we want to use

// 3 Classes, Red, Green and Blue. 
// To run functions from any of them we need to create separate instances

// We want to be able to switch to using Red, Green or Blue without creating new objects

public class Red implements ColourPrint {

	@Override
	public String printShape(String shape) {
		return "Red " + shape;
	}

}
