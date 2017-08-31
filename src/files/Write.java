package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		//1.define the path we want to write to
		String filename = "/Users/justin/Eclipse Workspaces/Files/FiletoWrite.txt";
		String message = "I'm writing data that will be placed in a file";
				
		//2.create the file in java
		File file = new File(filename);
		
		try {
			//3.open the file
			FileWriter fw = new FileWriter(file);
			
			//4.write to the file
			fw.write(message);	
			
			//5.close the resources
			fw.close();
			
		} catch (IOException e) {
			System.out.println("error: could not read file: " + filename);
			e.printStackTrace();
		}
		finally {
			System.out.println("closing the file writer");
		}
	}

}
