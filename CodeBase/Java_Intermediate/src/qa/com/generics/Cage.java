package qa.com.generics;

// This class can contain an Animal of any type
// Our cage can now take in a type of t / type 
// t MUST extend off of something, and it can accept any classes of that type
// It must be of type Animal
// Lion = Animal
// Dog  = Animal
public class Cage<t extends Animal> {
	
	// Takes in a class of any type and calls it animal
	private t animal;

	public t getAnimal() {
		return animal;
	}

	public void setAnimal(t animal) {
		this.animal = animal;
	}	

}
