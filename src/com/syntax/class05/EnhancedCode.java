package com.syntax.class05;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		System.out.println("Quiz score");
double Quiz=scan.nextDouble();
		System.out.println("Mid Term Score?");
		double Term=scan.nextDouble();
		System.out.println("Final Score?");	
		double Final=scan.nextDouble();
		
		double Average=((Quiz+Term+Final)/3);
		char grade = 0;
		
		if(Average>=90) {
			grade='A';
			// System.out.println("Your grade is A");
			
		}else if(Average>=70&&Average<90) {
			grade='B';
			//System.out.println("Your grade is B");
			
		}else if(Average>=50&&Average<70) {
			grade='C';
			//System.out.println("Your grade is C");
			
		}else if(Average<50){
			grade='F';}
			//System.out.println("Your grade is F");
			System.out.println("You are " +grade+ "student");
	
		if(grade=='A'||grade=='B') {System.out.println("You doing great");
		} else {System.out.println("Study more");}
		
	int num1=20;
	int num2=10;
	int num3=22;
	int largest;
	if(num1>num2&&num1>num3) {
		largest=num1;
		//System.out.println("The largest number is "+num1);
		}else if(num3>num1&&num3>num2) 
		{largest=num3;
		//System.out.println("The largest naumber is "+ num3);
		}else if (num2>num1&&num2>num3) 
		{largest=num2;}
		else { System.out.println("all numbers equal");
		largest=num1;
		}
	if (largest!=0) {
		// System.out.println("The largest number is "+num2);
	System.out.println("The largest number is "+largest);
	}


	}}

