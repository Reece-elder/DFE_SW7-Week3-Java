package qa.com.solid.openClosed;

public class Calzone {
	
	private String type;
	private int size;
	private String sauce;
	
	public Calzone(String type, int size, String sauce) {
		super();
		this.type = type;
		this.size = size;
		this.sauce = sauce;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
	
	// Create a function for cooking the calzone
	
	public String cookCalzone() {
		return "Calzone cooked!";
	}
	
	

}
