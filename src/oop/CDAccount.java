package oop;

public class CDAccount extends BankAccount implements IRate{
	//every class automatically inherits object class, not CDAccount also inherits BankAccount class
	
	String interestRate;
	
	void compound() {
		System.out.println("compounding interest");
	}

}
