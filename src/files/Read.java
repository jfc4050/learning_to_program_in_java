package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		//1. define file (path) that we want to read
		String filename = "/Users/justin/Eclipse Workspaces/Files/FiletoRead.txt";
		//2. create the file in java
		File file = new File(filename);
		String text = null;
		try {
			//3. open the file 
			BufferedReader br;
			
			br = new BufferedReader(new FileReader(file));
			
			//4. read the file
			text = br.readLine();
			
			//5. close the resources
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("error: file not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("error: could not read data: " + filename);
			e.printStackTrace();
		}
		finally {
			System.out.println("finished reading the file");
		}
		System.out.println(text);
	}

}
