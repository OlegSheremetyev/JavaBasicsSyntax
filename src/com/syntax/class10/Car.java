package com.syntax.class10;

public class Car {
	String model;
	String make;
	String color;
	int year;
	String typeOfengine;
	int NoOfDoors;
	int HP;
	void MoveForward() {System.out.println("Car is moving forward");}
	void reverse () {System.out.println("Moving reverse");}
	public static void main(String[] args) {
		Car bmw=new Car();
		bmw.model="X6";
		bmw.make="BMW";
		bmw.color="Black";
		bmw.year=2022;
		bmw.typeOfengine="V8";
		bmw.HP=500;
		System.out.println(bmw.model);
		bmw.MoveForward();
		bmw.reverse();
		
		
		Car lexus=new Car();
		
        lexus.model="Lfa";
		lexus.make="lexus";
		lexus.color="white";
		lexus.MoveForward();
	}

}
