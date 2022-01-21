package qa.com.hashMap;

import java.util.HashMap;
import java.util.Map.Entry;

// Hashmaps
// Allow you to store information in a collection (Lists, ArrayLists, Maps) 
// You store information with a index (Key) and data (Value) pair
// A list of key value pairs (can be made up of any data types)
public class HashRunner {
	
	public static void main(String[] args) {
		
		// We are creating a HashMap which takes in a String and a String
		// Its called currencies
		// Its created by returning HashMap<>()
		HashMap<String, String> currencies = new HashMap<>();
		
		// Add data to my HashMap by using put()
		currencies.put("United Kingdom", "Pound Sterling");
		currencies.put("France", "Euro");
		currencies.put("Internet", "Dogecoin");
		
		// Prints out the map with all the values
		System.out.println(currencies);
//		{United Kingdom = currency@com.qa.hash67272b29} 
		// Happens if the object passing in doesnt have a toString
		
		// Returns the length of the map
		System.out.println(currencies.size());
		
		// Get 
		System.out.println(currencies.get("Internet"));
		
		// Remove
//		currencies.remove("France");
		System.out.println(currencies);
		
		// Looping
		// keySet()   = The key (left of the map)
		// values()   = The values (right of the map)
		// entrySet() = The entire thing
		
		for(String i : currencies.keySet()) {
			System.out.println(i);
//			currencies.remove(i);
		}
		
		for(String i : currencies.values()) {
			System.out.println(i);
		}
		
		for(Entry<String, String> i : currencies.entrySet()) {
			System.out.println(i);
		}
		
		// Hashmaps just like arraylists / lists can take in custom objects
		
		HashMap<Country, String> currencies2 = new HashMap<>();
		currencies2.put(new Country("USA"), "Dollars");
		System.out.println(currencies2);
		
	}

}
