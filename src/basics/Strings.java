package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		bookTitle = "the lord of the rings";
		String wordChoice = "ring";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("the book contains the word " + wordChoice);
		}
		
		String browser = "chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("the browser is chrome");
		}
		
		String firstName = "justin";
		String lastName = "chiu";
		String SSN = "123456789";
		
		System.out.println("there are " + SSN.length() + " integers in your SSN.");
		
		//print the intials plus last 4 digits of SSN
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.println(SSN.substring(5));

	}

}
