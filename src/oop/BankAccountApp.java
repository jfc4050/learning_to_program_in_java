package oop;

public class BankAccountApp {
	
	public static void main(String[] args) {
		//creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "321895478293";
		
//		acc1.name = "justin";
		//with ENCAPSULATION:
		acc1.setName("justin");
		System.out.println(acc1.getName());
		acc1.setSSN("45488");
		System.out.println(acc1.getSSN());
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.balance = 10000;
//		cd1.interestRate = "4.5"; // child class variables not available in parent class
//		acc1.routingNumber = "23423"; //private, cant be called directly, but can be brought out through methods within the class
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		//(polymorphism through overwriting)
		System.out.println(acc1.toString()); //toString() >> oop.BankAccount@7852e922
		
		BankAccount acc2 = new BankAccount("checking account");
		acc2.accountNumber = "321895478293";
//		acc2.routingNumber = "234234232";
		
		//POLYMORPHISM >> different code executed, despite same method being called (polymorphism through overloading)
		BankAccount acc3 = new BankAccount("checking account", 5000);
		acc3.accountNumber = "321895478293";
//		acc3.routingNumber = "234523232";
		acc3.checkBalance();
		
		//demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
//		cd1.name = "juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		
		//notice that default constructor is also inherited, not the alternate constructors
		
		
	}
}
