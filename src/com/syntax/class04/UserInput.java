package com.syntax.class04;

import java.util.Scanner;

public class UserInput {public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);//Creating Scanner
	
	//send instructions to console
	
	System.out.println("Please enter your name");
	
	//we need to grab the value from console
	String name=input.next();
	System.out.println(name);
	System.out.println(name +" oleg please enter your age ");
	int age=input.nextInt();
	System.out.println(name +" is "+age+ " years old");
	
}

}
