package com.syntax.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// and && or|| !not
		boolean job = true;
		double salary = 100000;
		if (job && salary >= 100000) {
			System.out.println("Im super happy");

			boolean job1 = true;
			double salary1 = 75000;
			if (job1 && salary1 >= 100000) {
				System.out.println("Im super happy");

				boolean study = true;
				boolean homework = true;
				boolean practice = true;
				if (study && homework && practice) {
					System.out.println("you will succeed");
				} else {
					System.out.println("you will strugle");

				}

			}

		}

		int num1 = 65;
		int num2 = 66;
		int num3 = 23;

		if (num1 > num2 && num1 > num3) {
			System.out.println("The largest is " + num1);
		} else if (num3 > num1 && num1 > num3) {
			System.out.println("The largest is " + num3);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("The largest number is " + num2);

		}
	
	}
}
