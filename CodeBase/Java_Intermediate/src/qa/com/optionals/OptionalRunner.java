package qa.com.optionals;

import java.util.List;
import java.util.Optional;

public class OptionalRunner {
	
	// Make a list of names for use with the code
	private List<String> listNames = List.of("Harry", "Morgan", "Reece");
	
	// Method to filter through the names and return the chosen one
	private String filter(String query) {
		for (String name : this.listNames) {
			if(name == query) {
				return name;
			}
		}
		return null;
	};
	
	// Method to filter through the names and return the chosen one as an optional
	// Returns an Optional object with a value of String
	private Optional<String> filterOptional(String query) {
		for (String name : this.listNames) {
			if(name == query) {
				// An optional object with the value of name (String)
				return Optional.of(name);
			}
		}
		// Returning an optional class WITH NO BODY 
		return Optional.empty();
	};
	
	public static void main(String[] args) {
		
		OptionalRunner exercise = new OptionalRunner();
		
		System.out.println(exercise.filter("Toby"));
		
		// Create a new Optional object called whats in the box
		// It is equal to what our filter method returns 
		Optional<String> whatsInTheBox = exercise.filterOptional("Jack");
		System.out.println(whatsInTheBox);
		
		// Will return the value in the box, if there is something 
		// Returns an exception error if the box is empty
//		String filteredName = whatsInTheBox.get();
		
		// Will return the value in the box, if it is null return (this) instead
		String otherName = whatsInTheBox.orElse("name not found");
		
//		System.out.println(filteredName);
		System.out.println(otherName);
		
		
		
	}

}
