package qa.com.designPattern.builder;

public class AccountBuilder {
	
	private long accountNumber;
	private String owner = "John Smith";
	private String branch = "London";
	private double balance;
	private double interestRate = 0.02368;
	
	// Creating our account builder
	public AccountBuilder() {}
	
	// Create a method which returns our account builder
	public BankAccount buildAccount() {
//		BankAccount myAccount = new BankAccount(accountNumber, owner, branch, balance, interestRate)
//		Equivalent to creating a new account in a separate class
		
		return new BankAccount(accountNumber, owner, branch, balance, interestRate);
	}
	
	// Methods for all variables we can set
	public AccountBuilder accountNumber(long accNumber) {
		this.accountNumber = accNumber;
		// return this means return the object this method is connected to
		return this;
	}
	
	public AccountBuilder owner(String owner) {
		this.owner = owner;
		return this;
	}
	
	public AccountBuilder balance(double balance) {
		this.balance = balance;
		return this;
	}
	
	
	

}
