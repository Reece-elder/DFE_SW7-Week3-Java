package qa.com.designPattern.strategy;

public class Green implements ColourPrint {
	
	@Override
	public String printShape(String shape) {
		return "Green " + shape;
	}

}
