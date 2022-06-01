package com.syntax.class07;

import java.util.Scanner;

public class PasswordLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		String password="123";
		do {
		System.out.println("Please enter a paswword");
		password=scan.next();
		}while(!password.equals("123"));
		System.out.println("You got it!");

		
		int a=0;
		while(a!=5) {System.out.println("What is my secret number?");
		a=scan.nextInt();}
		System.out.println("Well done");
		}
	}

