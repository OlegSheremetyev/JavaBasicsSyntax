package com.syntax.class07;

public class IncrecementAndDecresment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int x=10;
		x=x+1;
		x+=1;
		System.out.println(x);
		x++;//Increments value by 1
		System.out.println(x);

		x--;//decrements value by 1
		System.out.println(x);
		
		//increments and decrements operators work only with variable
		
		int num=100;
		num++;
		System.out.println(num); // Loops in java . What-statement that executes block of code n numbers of times why-  eliminate code , 
		// while do while for loop enhanced loop/advance for loop
		
		System.out.println("Hello");
		
		//while loop-repeats block of code based on condition 
		
		int time =10;
		if(time<12) {System.out.println("Morning");}
		while (time<12) {System.out.println("Morning");
		time++;}
		
		System.out.println("Hello");
		
		int num1=1;
		while (num1<=10)
		{System.out.println(num1);
		num1++;}
		
		int num2=0;
		while (num2<=10) {
		num2++;
			System.out.print(num2);
		}
		
		int a=10;
		while(a<=100 ) {System.out.print(a+" ");
		a++;
		}
		int b=10;
		while(b>=1) {System.out.println(b+" ");
		b--;
		}
		int c=100;
		while (c>=50 ){
	System.out.print(c+" ");
		c--;}
		
		int d =-1;
		while(d>=-10) {System.out.println(d+" ");
			d--;}
		}
	}


