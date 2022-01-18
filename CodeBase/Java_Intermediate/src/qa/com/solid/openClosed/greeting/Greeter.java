package qa.com.solid.openClosed.greeting;

// Greeter class that will use the passed in greeting object
public class Greeter {
	private Greeting greeting;

	// Constructor that takes in Greeting
	public Greeter(Greeting greeting) {
		super();
		this.greeting = greeting;
	}

	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	
	// Create a method to run the greeting function
	public String greet() {
		// Return the return of the greetMessage used in this object
		return this.greeting.greetMessage();
	}
}
