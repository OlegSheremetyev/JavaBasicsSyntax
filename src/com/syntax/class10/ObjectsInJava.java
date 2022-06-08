package com.syntax.class10;

import java.util.Scanner;

public class ObjectsInJava {

	
		// TODO Auto-generated method stub
		
		String name;
		int age;
		double weight;
		String color;
		double height;
		String breed;
		void bark() {System.out.println("Dog barks");}
		void walks() {System.out.println("Dog walks");}
		void eat() {System.out.println("Dog eat bone");}

	
public static void main(String[]args) {
	
	
	ObjectsInJava dog =new ObjectsInJava();
	//new ObjectsInJava we create an object
	//Scanner scanner=new Scanner(System.in);
	//scanner.next();
	dog.name="Luna";
	dog.age=6;
	dog.weight=16;
	dog.color="Black";
	dog.height=2.6;
	dog.breed="German";
	dog.bark();
	
	
	
	
	
}

}