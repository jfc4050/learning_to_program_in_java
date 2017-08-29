package basics;

public class Days {
	public static void main(String[] args) {
		//execute differnt block of code based on value of condition
		String dayOfWeek = "tuesday";
		
		switch (dayOfWeek) {
			case "monday": 
				System.out.println("today is monday");
				break;
			case "tuesday": 
				System.out.println("today is tuesday");
				break;
			case "wednesday": 
				System.out.println("today is wednesday");
				break;
			case "thurdsay": 
				System.out.println("today is thursday");
				break;
			case "friday": 
				System.out.println("today is friday");
				break;
		}
	}
	
}
