package com.syntax.class04;

import java.util.Scanner;

public class Review1 {public static void main(String[] args) {
	
	String firstName="Ali";
	String lastName="Baba";
	String fullName=firstName+lastName;
	int num=10;
    int num2=10;
	System.out.println(fullName);
	System.out.println(firstName+num);
	System.out.println(firstName+num+num2);//1st operation=firstname+num=>Ali10+10=>Ali1010
	System.out.println(firstName+(num+num2));//1st operation =(num+num1)=>10+10=>Ali+20=>Ali20
	System.out.println(num+firstName+num2);//10Ali10
	
	////Operators in java Arithmetics +-/*% Logical == !=
	
	int num3=10;
	int num4=10;
	System.out.println(num3+num4);//20
	System.out.println(num3>=num4);//num>num2 or num=num2
	
	//
	System.out.println(Long.MAX_VALUE);// Gives us the maximum range
	System.out.println(Long.MIN_VALUE);
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Integer.MAX_VALUE);
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter your name");
	String name=scanner.nextLine();
	System.out.println("Please enter your age");
	Scanner age=new Scanner(System.in);
	int age1=scanner.nextInt();
	System.out.println(name+age);
	
	
	
	
	
	
	
	
	
}

}
