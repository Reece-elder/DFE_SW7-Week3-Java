package qa.com.generics;

public class GenRunner {
	
	public static void genericsExample() {
		
		// Make some cages for my specific animals
		Cage kennel = new Cage();
		kennel.setAnimal(new Dog());
//		((Dog) kennel.getAnimal()).fetch();
		
		Cage lionCage = new Cage();
		lionCage.setAnimal(new Lion());
		
		// We can add a lion to the kennel and a dog to the lionCage
		kennel.setAnimal(new Lion()); // Works completely fine because our cage takes in any type of animal
		
		// Generics allow us to specify what type of class a class should contain / be
		// Leave this as flexible in the code, until we get to run time
		
		// Cage that takes in the class of Dog
		// No longer takes in a type of animal, but is more specific
		Cage<Dog> kennel2 = new Cage<>();
		kennel2.setAnimal(new Dog());
		kennel2.getAnimal().fetch();
		
		// Doesnt work because kennel2 ONLY takes in type of dog
//		kennel2.setAnimal(new Lion());
		
		Cage<Lion> lionCage2 = new Cage<>();
		lionCage2.setAnimal(new Lion());
		
		// Perfectly fine code, will work but doesnt make sense 
//		Cage<Animal> rockCage = new Cage<>();
//		rockCage.getAnimal();
		
		
		// Exercise - Create a parent class for pokemon (or anything you want tbf)
		// Create 2 children of that class
		// Create some type of container wrapper class that contains the sub child
		// Using generics set the container / wrapper class to the child class and run a function
	}

}
