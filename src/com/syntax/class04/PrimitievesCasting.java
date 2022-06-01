package com.syntax.class04;

public class PrimitievesCasting {

	public static void main(String[] args) {
		int i;
		i = 100;
		double d = 100;
		System.out.println(i);// 100
		System.out.println(d);// 100.0
		// Casting in Java=> converting 1 type in to another
		// byte>short>int>long>float>double
		// widening/implicit/automatic
		long l = 10000;// widening/implicit/automatic MISTAKE AUTOMATICLY SOLVED
		byte b = 130; // narrowing MISTAKE
		// double>float>long>int>short>byte
		// narrowing
		int x = 100.99; // narrowing miss match cant do double>int MISTAKE
		//
		int x = (int) 100.99;
		System.out.println(x);

	}

}
