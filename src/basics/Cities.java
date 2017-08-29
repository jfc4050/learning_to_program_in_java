package basics;

public class Cities {

	public static void main(String[] args) {
		
		//declare and define an array
		String[] cities = {"new york","san francisco","miami","dallas"};
		System.out.println(cities[0]); 
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//declare and define an array (only size)
		String[] states = new String[5];
		states[0] = "california";
		states[1] = "ohio";
		states[2] = "new jeresey";
		states[3] = "texas";
		states[4] = "utah";
		
		//DO LOOP: enters the loop then tests condition
		System.out.println("\nPRINTING WITH DO LOOP");
		int i = 0;
		do {
			System.out.println("state: " + states[i]);
			i += 1;		
		} while (i < 5);
		
		//WHILE LOOP: test conditions first then enters the loop
		System.out.println("\nPRINTING WITH WHILE LOOP");
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			if (state == "texas") {
				System.out.println("state found");
				stateFound = true;
			}
			n++;
		}
		
		//FOR LOOP: best structure for iterating through an array
		System.out.println("\nPRINTING WITH FOR LOOP");
		for (int x = 0 ; x < 5 ; x++ ) {
			System.out.println(states[x]);
		}
		
		//declare array
		String[] countries;
		
		//define the array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);
	}

}
