package com.syntax.class08;

public class AddArrayValuesUsingLopp {

	public static void main(String[] args) {
		// Write a program that creates an array of integers of size 11. Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values.

		int [] array=new int[11];
		  for(int i=0;i<array.length;i++){array[i]=i+2010;
		    System.out.println(array[i]);}
		  

	}

}
