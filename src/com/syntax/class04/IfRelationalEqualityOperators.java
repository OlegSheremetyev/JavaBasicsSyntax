package com.syntax.class04;

public class IfRelationalEqualityOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// >,<,>=,<=<==<!=
		int num1 = 20;
		int num2 = 22;
		boolean result;

		System.out.println(num1 > num2);// false
		System.out.println(num1 > num2);// true
		System.out.println(num1 != num2);// true
		// !=not eual
		// == equal
		System.out.println(num1 == num2);// no=false
		System.out.println(num1 = num2);// 22
		System.out.println(num1 == num2);// true
		result = 100 > 200;
		System.out.println(result);// false
		String result2 = "emre" + 10;
		System.out.println(result2);
		int num3 = 10;
		int num4 = 11;

		result = num3 == num4;
		System.out.println(result);// false
		result = num3 != num4;// check if num3 not equal to num4
		System.out.println(result);// true

	}

}
