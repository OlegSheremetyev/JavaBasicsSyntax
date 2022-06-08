package com.syntax.class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using scanner create an array of integer values , after calculate the sum and store values in array
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Please enter the size of the array that you want to create");
		int arraySize=scanner.nextInt();
		int[]intigerArray=new int[arraySize];
		//we cant use enhanced for loop for inserting or updating the values of an array
		for (int i=0;i<intigerArray.length;i++) {intigerArray[i]=scanner.nextInt();}
		System.out.println(Arrays.toString(intigerArray));
		int sum=0;
		for (int element:intigerArray) {sum=sum+element;}
		System.out.println("The sum of all the elements is "+sum);
		
		
		//using Scanner create an array method stub of countries
		//when created retrieve all values from it
		//and while retrieving print capitals
		System.out.println("Please enter the size of the array that you want to create");
		int arraySize1=scanner.nextInt();
		String []countries=new String[arraySize1];
		for (int y=0;y<countries.length;y++) {countries[y]=scanner.next();}
		for (String element:countries) {if(element.equalsIgnoreCase("usa")) {
			System.out.println("Washington Dc");}else if(element.equalsIgnoreCase("turkey")) {
				System.out.println("Ankara");
			}else if (element.equalsIgnoreCase("Thailand")) {
				System.out.println("Bangkok");}else {System.out.println("Country not supported ");
			}
		}
		
		
		
		}
	}


