package com.syntax.class04;

public class IfStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Conditional statements
		// 1 If statement
		// if rate is more than 5 > im not buying a house
		// if rate is less than 5< im buing house

		// 2
		double mortgageRate = 5.5;
		if (mortgageRate > 5) {
			System.out.println("Im not buying a house");

		}
		int num1 = 99;
		int num2 = 10;
		if (num1 > num2) {
			System.out.println(num1 + " is bigger than " + num2);
		}
		/*
		 * declare temperature if temp>75 > i go for a walk
		 *
		 */
		int temp = 68;

		if (temp > 75) {
			System.out.println("I'll go for a walk");
		} else {// otherwise .Code comes to else when condition is false
			{
				System.out.println("Ill stay home");
			}

			System.out.println("              ");

			char gender = 'f';
			if (gender == 'f') {
				System.out.println("you like shopping");
			} else {
				System.out.println("you like watching sport");
			}

			System.out.println();

			String browser = "chrome";
			if (browser.equals("chrome")) {
				System.out.println("All test cases will be executed on chrome");
			} else {
				System.out.println("Im not doing anything");
			}

		}

	}

}
