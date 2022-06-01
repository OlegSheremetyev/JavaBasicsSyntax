package com.syntax.class04;

public class IfNoBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time = "Morning";
		if (time.equals("Morning")) {
			System.out.println("Say good morning");
		} else {
			System.out.println("Say good day");
		}
		System.out.println("End of code");

	}
	String time = "Morning";{
	if (time.equals("morning")) 
		System.out.println("Say good morning");
	 else 
		System.out.println("Say good day");
	
	System.out.println("End of code");
}
}
