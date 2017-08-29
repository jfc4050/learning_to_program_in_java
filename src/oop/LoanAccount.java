package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("rate");
		
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		System.out.println("increase rate");
		
	}
	
	public void setTerm(int terms) {
		System.out.println("setting term to: " + terms + " years");
	}
	
	public void setAmortSchedule() {
		System.out.println("Amortization Schedule");
	}

}
