package Homework;

import java.util.Scanner;

public class HwScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a java program in which using Scanner you are going to capture user’s
		 * first name, last name and state where he/she lives.
		 * 
		 * 2. Create a java program in which using Scanner you are going to capture 2
		 * numbers. And once you capture 2 numbers, please check which one is the
		 * largest.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println(" Please, enter your  name  ");
		String name = input.next();
		System.out.println(name);
		System.out.println( name+" Please enter your age ");
		String age = input.next();
		System.out.println(age);
		System.out.println(name +" Please enter the state you are from ");
		String state = input.next();
		System.out.println(name+" is from "+state);

	}

}
