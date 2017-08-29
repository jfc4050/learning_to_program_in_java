package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}

public class Demo {
	public static void main(String[] args) {
		//instantiating an object
		Person person1 = new Person();
		
		//define some properties
		person1.name = "joe";
		person1.email = "joe@testmail.com";
		person1.phone = "23491234";
		
		//abstraction
		person1.walk();
		
		///
		
		person1.sleep();
		
		Person person2 = new Person();
	}
}


/*

public class Demo {

	public static void main(String[] args) {
		//person
		
		//attributes,variables,adjectives,descriptors
		String name = "joe";
		String email = "joe@testmail.com";
		String phone = "23491234";
		
		//action,activity,behavior
		System.out.println(name + " is walking");
		System.out.println(name +  " is eating");
		
		//attributes,variables,adjectives,descriptors
		String name = "sarah";
		String email = "sarah@testmail.com";
		String phone = "23491234";
				
		//action,activity,behavior
		//System.out.println(name + " is walking");
		walking(name2);
		System.out.println(name +  " is eating");
		
		//what about binding attributes and properties together?
	}
	
	//enhance by adding functions to minimize repetition
	static void walking(String name) {
		System.out.println(name + " is walking");
	}

}

*/