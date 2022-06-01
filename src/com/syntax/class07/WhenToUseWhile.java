package com.syntax.class07;

import java.util.Scanner;

public class WhenToUseWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int a=0;
		while(a!=5) {System.out.println("What is my secret number?");
		a=scan.nextInt();}
		System.out.println("Well done");

		int secretNum=25;
		int guessedNum;
		do {System.out.println("Guess my secret number");
		guessedNum=scan.nextInt();
		
		}while (guessedNum!=secretNum);
		System.out.println("You got it");
	}

}
