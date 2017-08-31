package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// 1. define the collection
			HashSet<String> animals = new HashSet<String>();
			//LinkedHash - in order they were entered - Stack
			//Hash - complete random order
			//TreeSet - natural order
		
		// 2. adding elements
			animals.add("dog");
			animals.add("pig");
			animals.add("giraffe");
			animals.add("cat");
			System.out.println(animals.size() + " " + animals);
	
			animals.add("giraffe");
			animals.add("cat");
			animals.add("goose");
			System.out.println(animals.size() + " " + animals);
		
		// 3. create a new set that we use for comparison
			Set<String> farmAnimals = new HashSet<String>();
			farmAnimals.add("chicken");
			farmAnimals.add("horse");
			farmAnimals.add("pig");
			farmAnimals.add("dog");
		
		// what is the INTERSECTION between animals and farm animals (in animals AND farmAnimals)
			//a. copy existing set into a new set
			Set<String> intersectionSet = new HashSet<String>(animals);
			System.out.println(intersectionSet);
			//b. retain only elements that are also in the other set
			intersectionSet.retainAll(farmAnimals);
			System.out.println("the intersection is: " + intersectionSet);
			
		// what is the UNION (in animals OR farmAnimals)
			Set<String> unionSet = new HashSet<String>(farmAnimals);
			unionSet.addAll(animals);
			System.out.println("the union is: " + unionSet);
			
		// what is the DIFFERENCE (animals but NOT farmAnimals)
			Set<String> differenceSet = new HashSet<String>(animals);
			differenceSet.removeAll(farmAnimals);
			System.out.println("the difference is: " + differenceSet);

		
	}

}
