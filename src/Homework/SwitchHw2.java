package Homework;

import java.util.Scanner;

public class SwitchHw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input=new Scanner(System.in);
	String grade;
	System.out.println("Please enter your grade");
	grade=input.nextLine();
	if (grade.equals("A")) {System.out.println("exelent");}
	else if (grade.equals("B")) {System.out.println("good");}
	else if (grade.equals("C")) {System.out.println("average");}
	else if (grade.equals("D")) {System.out.println("Bad");}
	else {System.out.println("Wrong entry");}
	
	
	System.out.println("Please enter your grade");
	
	
	
	String output;
	char grade1=input.next().charAt(0);
	switch (grade1) {
	case'A':
		output="Exelent";
		break;
	case'B':
		output="Good";
		break;
	case 'C':
		output="Average";
		break;
	case 'D':
		output="Bad";
		break;
	default:
		output="Wrong input";
		
	}
	
	System.out.println(output);
	}
	
	
	}
	


