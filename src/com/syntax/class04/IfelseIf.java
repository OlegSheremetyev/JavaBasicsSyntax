package com.syntax.class04;

public class IfelseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20;
		int num2 = 20;
		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is larger than " + num1);
		} else if (num2 == num1) {
			System.out.println(num1 + " is qual " + num2);
		}

		byte day = 7;

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		}

		int month = 3;
		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("february");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		}

		boolean mothersDay = true; // if (mothersDay)
		if (mothersDay == true) {
			System.out.println("Happy Mother's Day to all Moms!!!");
		} else {
			System.out.println("Hello!!!");
		}

		boolean rain = false;
		if (rain) {
			System.out.println("Ill take umbrella");
		} else {
			System.out.println("I dont need umbrella");
		}

	}

}
