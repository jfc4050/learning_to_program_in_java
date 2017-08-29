package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//create a variable to define our career
		
		//declare a variable
		String career;  //declares that its going to exist, doesn't initialize
		System.out.println("program is starting");
		
		//define a variable
		career = "software developer";
		System.out.println("my career is: " + career);
		
		//declare and define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "web developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("the salary as a " + career + " is: $" + salary);
		
		//compute annual salary
		//rate * hours/week * weeks/year
	}
}
