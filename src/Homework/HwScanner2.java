package Homework;

import java.util.Scanner;

public class HwScanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any number");
		int number1 = (input.nextInt());
		System.out.println(number1);
		System.out.println("Please enter another number");
		int number2 = (input.nextInt());
		
		if (number1>number2) {System.out.println(number1+" > "+number2);
		}else 
			System.out.println(number1+" < "+ number2);
		
		}

	}


