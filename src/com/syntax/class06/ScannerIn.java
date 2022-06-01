package com.syntax.class06;

import java.util.Scanner;

public class ScannerIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Name");
		String name=scan.next();// next line to capture whole line
		System.out.println(name);
		System.out.println("age");
		int age=scan.nextInt();
		System.out.println(age);
		System.out.println("Price");
		double price=scan.nextDouble();
		System.out.println(price);
		System.out.println("char");
		char char1=scan.next().charAt(0); //capture 1 char
		System.out.println(char1);
		
		
		
		
		
	}

}
