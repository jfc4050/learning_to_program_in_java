package oop;

//instantiate objects from this
public class BankAccount implements IRate {
	
	//DEFINE VARIABLES
	String accountNumber;
	
	//STATIC VARIABLES
	//static >> this variable belongs to the class, not the particular object
	//final >> immutable
	private static final String routingNumber = "23492";
	
	//INSTANCE VARIABLES
	private String name;
	private String SSN;
	String accountType;
	double balance = 0; //available to all of the methods, but can be updated by the methods
	
	//CONSTRUCTORS definitions: unique methods
		// 1. used to define/setup/initialize properties of an object
		// 2. constructors are IMPLICITLY called upon INSTANTIATION (called automatically when we create an object)
		// 3. same name as the class itself
		// 4. constructors have no return type
	BankAccount() {
		System.out.println("no account created");
	}
	//overloading: call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("new account:" + accountType);
	}
	BankAccount(String accountType, double initDeposit) {
		//initDeposit, accountType, msg are all LOCAL VARIABLES >> defined within blocks (only exist within that block)
		System.out.println("new account: " + accountType);
		System.out.println("initial deposit " + initDeposit);
		
		String msg = null;
		if (initDeposit < 1000) {
			msg = "error: minimum deposit is $1000";
		} else {
			msg = "thanks for your initial deposit of: " + initDeposit;
		}
		System.out.println(msg);
		balance += initDeposit;
	}
	
	// GETTERS / SETTERS
	//allow the user to define the name 
	public void setName(String name) {
		this.name = name; //set instance variable equal to local variable
	}
	public String getName() {
		return "Mr. " + name;
	}
	
	public String getSSN() {
		return "SSN is: " + SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	//define METHODS
	//public - available anywhere in the project
	//default is anywhere in the package
	//private - only available in the class
	public void deposit(double amount) {
		balance += amount;
		showActivity("deposit");
	}
	
	//INTERFACES - whoever implements this has the same methods
	public void setRate() {
		System.out.println("setting rate");
	}
	public void increaseRate() {
		System.out.println("increasing rate");
	}
	
	void withdraw(double amount) {
		balance -= amount;
		showActivity("withdrawal");
	}
	
	//private >> can only be called from within class
	private void showActivity(String activity) {
		System.out.println("showing recent activity");
		System.out.println("your recent transaction: " + activity);
		System.out.println("your new balance is $" + balance);
	}
	
	void checkBalance() {
		System.out.println("balance is:" + balance);
	}
	
	void getStatus() {
	}
	
	//overrides toString method in object class (one step above bankaccount class)
	public String toString() {
		return "[name: " + name + ". account#: " + accountNumber + ". balance: $" + balance + ". routing#: " + routingNumber + "]";
	}
	
}
