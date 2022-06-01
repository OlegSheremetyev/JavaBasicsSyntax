package com.syntax.class07;

import java.util.Scanner;

public class taskLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		
		String answer="yes";
		do {
		System.out.println("Please apply for a credit card");
		answer=scan.next();
		}while(!answer.equals("yes"));
		System.out.println("You got it!");
	}

}
