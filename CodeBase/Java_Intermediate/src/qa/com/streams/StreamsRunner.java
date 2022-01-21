package qa.com.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsRunner {
	
	// Streams
	// Streams are a collection of functions for working with arrays / lists of objects
	// Allow you to `efficiently` sort, filter, map and print out objects within a list
	// Streams do not change the structure, they just provide a result based on what you put in
	
	public static void main(String[] args) {
		
		// Wrapper class for Integer rather than int
		// Streams only work for complex objects, so we convert from simple ints to Integer
		List<Integer> numberList = List.of(1,2,3,4,5,6,7,8);
		
		// Creating a new Stream object which is equal to our list (but streamed())
		Stream<Integer> newList = numberList.stream();
		
		System.out.println(numberList); // Prints off the list before stream();
		System.out.println(newList); // Prints off the object reference
		
		// Java Lambda Function
		// We pass in what the method returns 
		// Call this variable 'number'
		// On the right of the arrow is what we want to do with number
		newList.forEach((number) -> System.out.println(number));
		// Our stream uses the forEach method to `do something` with each object in itself
		
		List<String> nameList = List.of("Jenna", "Bodhi", "Rachel", "Steve");
		// The list ISNT being converted to a stream explicitly
		// But is using the stream() methods
		nameList.stream().forEach((name) -> printName(name));
		
		// Sorting - Returns a sorted list
		// .sorted() - Sorting the stream alphabetically
		// .collect() - Store the new list in some way
		// (Collectors.toList()) - Store the new list as a new list
		List<String> sortedNames = nameList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames);
		
		// Filters Which filter the stream only showing certain things
		List<String> filteredNames = nameList.stream().filter((name) -> name.startsWith("B"))
		.collect(Collectors.toList());
		System.out.println(filteredNames);
	}
	
	public static void printName(String name) {
		System.out.println("Name: " + name);
	}

}
