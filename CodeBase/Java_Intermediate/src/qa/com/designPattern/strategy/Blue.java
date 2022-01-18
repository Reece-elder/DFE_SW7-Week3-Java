package qa.com.designPattern.strategy;

public class Blue implements ColourPrint {

	// Each seperate class has its own overridden method
	@Override
	public String printShape(String shape) {
		return "Blue " + shape;
	}
	
	

}
