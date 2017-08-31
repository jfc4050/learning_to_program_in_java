package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// read a text file and retrieve phone number
		
		String filename = "/Users/justin/Eclipse Workspaces/Files/phonenumber.txt";
		File file = new File(filename);
		String[] phoneNums = new String[4];
		String phoneNum = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0 ; i < phoneNums.length ; i++) {
				phoneNum = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("error: file not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("error: could not read file: " + filename);
			e.printStackTrace();
		}
		
		try {
			if (phoneNum.length() != 10) {
				throw new TenDigitsException(phoneNum);
			}
			if (phoneNum.substring(0,1).equals("0") || phoneNum.substring(0,1).equals("9")) {
				throw new AreaCodeException(phoneNum);
			}
			for (int n = 0 ; n<phoneNum.length() ; n++) {
				if (phoneNum.substring(n,(n+1)).equals("9")) {
					if (phoneNum.substring(n+1,n+3).equals("11")) {
						throw new EmergencyException(phoneNum);
					}
				}
			}
			System.out.println(phoneNum);
		} catch (TenDigitsException e ) {
			System.out.println("phone number is not ten digits");
			System.out.println(e.toString());
		} catch (AreaCodeException e) {
			System.out.println("phone number has invalid area code");
			System.out.println(e.toString());
		} catch (EmergencyException e) {
			System.out.println("invalid 911 sequence found");
		}
		
		// valid phone number:
			// 10 digits long
			// area code cannot start with 0 or 9
			// 911
	}

}

class TenDigitsException extends Exception {
	String num;
	TenDigitsException(String num){
		this.num = num;
	}
	public String toString() {
		return ("tenDigitsException: " + num);
	}
}

class AreaCodeException extends Exception {
	String num;
	AreaCodeException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("AreaCodeException: " + num);
	}
}

class EmergencyException extends Exception {
	String num;
	EmergencyException(String num){
		this.num = num;
	}
	public String toString() {
		return ("EmergencyException: " + num);
	}
}
