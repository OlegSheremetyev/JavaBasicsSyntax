package com.syntax.class06;

import java.util.Scanner;

public class ScanIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you have a credit card");
		String credit=scan.next();
		 if (credit.equals("no")) {
			 System.out.println("We will offer you a credit card");}
		 else if(credit.equals("yes")) {
			 System.out.println("What is your balance");
		int balance=scan.nextInt();
	
		if (balance>1000) {
			System.out.println("You have to pay off immediately");
		}else {
			System.out.println("You can spend more");
	}

		
}
	}
	
	
	
	
	
	
	
	
	}

	
