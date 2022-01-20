package qa.com.exception;

public class ExceptionRunner {
	
	// Exceptions are abnormal conditions, they `CAN` disrupt the flow of an app
	// Exceptions can be used to alert the user 'Something bad has happened' but the app doesnt crash
	
	// Try		- What you want the code to attempt to do 
	// Catch	- What Exception you want the code to throw if it detects an issue
	// Finally  - What the code should do regardless of it throwing an exception or not
	
	public static void makeError() {
		int[] numberArray = {1,2,3};
		// Error - Array Out of range, BIG ERROR
		System.out.println(numberArray[6]);
	}
	
	// Catch is taking the error, handling it and letting the app keep running
	public static void makeException() {
		try {
			int[] numberArray = {1,2,3};
			System.out.println(numberArray[6]);
		} catch (Exception exception) { // Exception is a built in Exception within Java
			exception.printStackTrace();
			System.out.println("Big Error!");
		}

	}
	
	public static void useCustomException() {
		try {
			int[] numberArray2 = {1,2,3};
			System.out.println(numberArray2[6]);
			System.out.println("You should never see this! ");
			// Create and Throw (let the catch handle it) error passing in our string
			throw new CustomException("Custom special error :o");
		} catch (CustomException exception) {
			exception.printStackTrace(); // Try Catch Blocks can use multiple Catch blocks
		} catch (ArrayIndexOutOfBoundsException exception) {
			exception.printStackTrace();
		}
		
		
	}
	
	public static void ifCustomException() {
		try {
			String colour = "red";
			if (colour == "red") {
				throw new CustomExceptionRed();
			} else if (colour == "blue") {
				throw new CustomExceptionBlue();
			}
		}

	}
	
	public static void main(String[] args) {
//		makeError();
		makeException();
		System.out.println("Runs after the error");
		useCustomException();
	}

}
