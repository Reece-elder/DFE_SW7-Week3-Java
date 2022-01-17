package qa.com.solid.runner;

import qa.com.solid.openClosed.Calzone;
import qa.com.solid.openClosed.Pizza;
import qa.com.solid.openClosed.PizzaOven;
import qa.com.solid.openClosed.greeting.CasualGreeting;
import qa.com.solid.openClosed.greeting.Greeter;
import qa.com.solid.openClosed.greeting.Greeting;
import qa.com.solid.single.Person;
import qa.com.solid.single.Spotify;

public class SubRunner {
	
	// Single Resp
	Person reece = new Person("Reece", 26, "Punk Rock");
	Spotify reeceSpotify = new Spotify();
	
	// Open - Closed
	Calzone neapolitan = new Calzone("neapolitan", 10, "tomato");
	Pizza hawaiian = new Pizza("Ham, pineapple", 12, false);
	PizzaOven pizzaOven = new PizzaOven();
	
	Greeting casual1 = new CasualGreeting();
	Greeter greeter = new Greeter(casual1);
	
	public void task() {
		System.out.println(reeceSpotify.playMusic(reece.getMusicTaste(), reece.getName()));
		
	}
	
	public void openClosed() {
		System.out.println(pizzaOven.cookItem(neapolitan.cookCalzone()));
		System.out.println(greeter.greet());
	}
}
