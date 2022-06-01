package com.syntax.class06;

import java.util.Scanner;

public class Tries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
		
		String car="";
		System.out.println("Please enter your favorite car make");
		car=input.nextLine();
		String origin="";
		switch(car) {
		
		case "BMW":
			origin="german car";
			break;
		case "Toyota":
			origin="japanese car";
			break;
		case "Maserati":
			origin="italian";
			break;
			default:
				origin="Unknown";
				
			
		}
		System.out.println(origin);










		  
		}
		           }
