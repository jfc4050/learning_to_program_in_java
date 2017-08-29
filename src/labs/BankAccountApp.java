package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("627881395",1000);	
			acc1.setName("justin");
			System.out.println("your name is: " + acc1.getName());
			acc1.makeDeposit(500);
			acc1.showBalance();
			acc1.withdraw(600);
			acc1.showBalance();
			acc1.withdraw(800);
			acc1.showBalance();
			acc1.accrue();
			acc1.showBalance();
			System.out.println(acc1.toString());
		
//		BankAccount acc2 = new BankAccount("235823760");
//		BankAccount acc3 = new BankAccount("106684723");
	}

}

class BankAccount implements IInterest {
	
	//properties of bank account
	private static int iD = 1000;		  // internal iD
	private String accountNumber; 		  //combination of iD + random 2 digit number + first two digits of SSN
	private static final String routingNumber = "0005400029";
	private String name;
	private String SSN;
	private double balance;
	
	//constructors
	public BankAccount(String SSN) {
		System.out.println("new account created with no initial deposit");
	}
	
	public BankAccount(String SSN, double initDeposit) {
		System.out.println("new account created with initial deposit");
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	
	//methods
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + random + SSN.substring(0,2);
		System.out.println("your account number is: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void makeDeposit(double depAmount) {
		System.out.println("depositing $" + depAmount);
		balance += depAmount;
	}
	public void withdraw(double withAmount) {
		System.out.println("withdrawing $" + withAmount);
		balance -= withAmount;
	}
	
	public void showBalance() {
		System.out.println("balance is: " + balance);
	}
	
	public void accrue() {
		balance *= (1+rate/100);	
	}
	
	@Override
	public String toString() {
		return "[name: " + name + "]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
	}
}