package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// 1. create a collection
		ArrayList<String> cities = new ArrayList();
		
		// 2. add some elements
		cities.add("cleveland");
		cities.add("toronto");
		cities.add("chicago");
		cities.add("miami");
		
		// 3. iterate the collection
		for (String city : cities) {
			System.out.println(city);
		}
		
		// 4. get the size
		int size = cities.size();
		System.out.println("there are " + size + " in the collection");
		
		// 5. retrieve specific element
		System.out.println(cities.get(0));
		
		// 6. remove
		cities.remove(0);
		size = cities.size();
		System.out.println("now there are " + size + " in the collection");
		for (String city : cities) {
			System.out.println(city);
		}
		
		
	}

}
