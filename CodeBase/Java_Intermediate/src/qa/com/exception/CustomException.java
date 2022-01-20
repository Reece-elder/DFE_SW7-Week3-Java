package qa.com.exception;

public class CustomException extends Exception {
	
	// Create a new exception taking in a String
	// Uses the super constructor (Exception) and passes in the string
	public CustomException(String errorMessage) {
		super(errorMessage);
	}
}
