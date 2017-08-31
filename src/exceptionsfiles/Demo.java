package exceptionsfiles;

public class Demo {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		//1. identify the potential problem area
		//2. surround with try-catch block
		try {
			int c = a/b;
		}catch (ArithmeticException e){
			System.out.println("cannot divide by zero");
			System.out.println(e.toString());
		}
		System.out.println("program is closing");
		
		String[] states = {"CA","TX","WA","NY"};
		for (int i = 0 ; i <= states.length ; i++) {
			try {
				System.out.println(states[i]);
			} 
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println("index outside of array domain");
				System.out.println(e.toString());
			}
			finally { //executed regardless of whether or not exception occured
				System.out.println("iterating through array");
			}
			
		}
		
	}
	public static void doMath(int a,int b) {
		int c = a/b;
		System.out.println(c);
	}
}
