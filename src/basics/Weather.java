package basics;

public class Weather {
	public static void main(String[] args) {
		//this program will give suggestions on what to wear based on the temperature
		
		int temperature = 65;
		String sunCondition = "overcast";
		
		if (temperature > 80) {
			System.out.println("its pleasant, wear shorts and t-shirt");
		}
		else if (temperature > 60 && sunCondition == "sunny") {
			System.out.println("long sleeve shirt and jeans");
			System.out.println("wear a hat to block the sun");
		}
		else if ((temperature > 50) || (sunCondition == "overcast")) {
			System.out.println("its a cold day, make sure to wear warmer clothes");
		}
		else {
			System.out.println("i have no idea");
		}
		
		System.out.println("The program is ending");
		
	}
}