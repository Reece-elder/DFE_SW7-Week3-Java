package qa.com.scanner;

import java.util.Scanner;

// Input Scanners open up the console to allow the user to enter some text
// When a java code hits a scanner it waits for the user to enter something, saves it as a variable
// then moves on with the code, doing something with the variable 

// String method - CREATE, READ, DELETE, UPDATE -> depending on what they enter you can do something
public class ScannerRunner {
	
	public static void main(String[] args) {
		// Add a Scanner object, called input
		// Make a new scanner, and it scans for system.in (the console and user entering text)
		Scanner input = new Scanner(System.in);
		System.out.println("Scanner isn't scanning yet!");
		
		System.out.println("Enter your name pls");
		String name = input.nextLine();
		System.out.println(name);
		
		// Saving the variable name job as the next line the scanner will check
		String job = input.nextLine();
		System.out.println(job);
		// Running the method process passing in what the scanner picked up
		process(job);
	}
	
	public static void process(String job) {
		System.out.println(job);
		if (job.equals("create")) {
			System.out.println("Add item to DB");
		} else if (job.equals("read")) {
			System.out.println("Read from DB");
		} else {
			System.out.println("Incorrect syntax");
		}
	}

}
