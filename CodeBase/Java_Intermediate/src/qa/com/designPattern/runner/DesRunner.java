package qa.com.designPattern.runner;

import qa.com.designPattern.adapter.RoundHole;
import qa.com.designPattern.adapter.RoundPeg;
import qa.com.designPattern.adapter.SquarePeg;
import qa.com.designPattern.adapter.SquarePegAdapter;
import qa.com.designPattern.builder.AccountBuilder;
import qa.com.designPattern.builder.BankAccount;
import qa.com.designPattern.builder.Pizza;
import qa.com.designPattern.builder.PizzaBuilder;
import qa.com.designPattern.strategy.Blue;
import qa.com.designPattern.strategy.Green;
import qa.com.designPattern.strategy.Red;
import qa.com.designPattern.strategy.StrategySwapper;

public class DesRunner {
	
	public void builder() {
		
		Pizza pepperoni = new PizzaBuilder().size(12).buildPizza();
		
		BankAccount myAccount = new AccountBuilder().accountNumber(74028174917393l).buildAccount();
		BankAccount savingsAccount = new AccountBuilder().accountNumber(7492719373l).balance(5000000.25).buildAccount();
		System.out.println(myAccount);
	}
	
	public void adapter() {
		
		// Create holes, pegs
		RoundHole hole = new RoundHole(10);
		RoundPeg roundPeg = new RoundPeg(7);
		SquarePeg squarePeg = new SquarePeg(5);
		
		if(hole.checksFit(roundPeg)) {
			System.out.println("Round peg fits in hole");
		} else {
			System.out.println("Doesnt fit!");
		}
		
		// Adapter - Takes in my square peg
		SquarePegAdapter squareAdapter = new SquarePegAdapter(squarePeg);
		
		// Wont work without adapter
		if(hole.checksFit(squareAdapter)) {
			System.out.println("Square peg fits in hole");
		} else {
			System.out.println("Square peg doesnt fit :( ");
		}
		
	}
	
	public void strategy() {
		
		// Having to create a new object for each can be time consuming and memory consuming
//		Red red = new Red();
//		Blue blue = new Blue();
//		Green green = new Green();
		
//		System.out.println(red.printShape("Hexagon"));
		
		// Initialise our swapper
		StrategySwapper swapper = new StrategySwapper();
		swapper.setColour(new Blue());
		System.out.println(swapper.print("star"));
		
		swapper.setColour(new Red());
		System.out.println(swapper.print("crescent"));
		
		
	}

}
