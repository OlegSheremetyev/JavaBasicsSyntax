package com.syntax.class05;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/*
		/*variable and matching cases must be of same type
		 * switch does not allow to have duplicate cases
		 * switch works with byte short int char String
		 * cant work with double float long boolean
		 * 
		 * 
		 */

		Scanner input=new Scanner(System.in);
		
		String choice;
		choice=input.nextLine();
		String discription;
		switch(choice) {
		
		case "Y":
			discription="Yes";
			break;
		case "M":
			discription="Maybe";
			break;
		case "N":
			discription="No";
			break;
			default:
				discription="Unknown";
				
			
		}
		System.out.println(discription);
		
		
		String country = null ,favoriteFood;
			
		switch (country.toUpperCase()) { //////////ignore case toLowerCase
		case"Mexico":
			favoriteFood="tacos";
          break;
		case"Canada":
		favoriteFood="poutine";
		break;
		case "Turkey":
			favoriteFood="lahmacun";
		case "Pakistan":
			favoriteFood="pati chai";
			break;
		case"Egypt":
			favoriteFood="koshary";
			break;
		case"USA":
		  favoriteFood="Burgers";
			break;
			default:
				favoriteFood="uknown";
				
				}
		System.out.println(favoriteFood);
	}
	

}
