package qa.com.designPattern.builder;

public class Pizza {
	
	private String cheese; 
	private String crust; 
	private int size;
	private String sauce;
	
//	Builder patten can only build objects which match the available constructors
	public Pizza(String cheese, String crust, int size, String sauce) {
		super();
		this.cheese = cheese;
		this.crust = crust;
		this.size = size;
		this.sauce = sauce;
	}

	public String getCheese() {
		return cheese;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	} 
	
	
	
	

}
