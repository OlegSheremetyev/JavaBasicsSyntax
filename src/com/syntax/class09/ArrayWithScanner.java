package com.syntax.class09;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the size of array");
		
		int size=scanner.nextInt();// ask the size of array
		String[]names=new String[size];// array of string size created
		for (int i=0; i<names.length;i++) {
			
			
			names [i]=scanner.next();// fill array with user input
		}
		
		
		System.out.println(Arrays.toString(names));
		
	}

}
