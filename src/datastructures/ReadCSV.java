package datastructures;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV {

	public static void main(String[] args) {
		//This method will read data from a CSV file
		List<String[]> data = new ArrayList<String[]>();
		String filename = "/Users/justin/Eclipse Workspaces/Files/accounts.csv";
		String dataRow;
		
		try {
			// open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			// read the data as long as its not empty
			while ((dataRow = br.readLine()) != null) {
				//parse the data by commas
				String[] line = dataRow.split(",");
				//add the data to the collection
				data.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String[] account : data) {
			System.out.print("[");
			for (String field : account) {
				System.out.print(field + " ");
			}
			System.out.print("]");
		}
		

	}

}
