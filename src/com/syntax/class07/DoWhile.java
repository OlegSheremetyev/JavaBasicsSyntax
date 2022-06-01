package com.syntax.class07;

public class DoWhile {

		
		// TODO Auto-generated method stub

		
		int num=1;{
		while (num<=3) {System.out.print(num+" ");
		num++;
		}
		
		System.out.print("---------------------------------");
		
		int num1=1;
		do { System.out.print(num1+" ");
		num1++; } while(num1<=3);
		
		System.out.print("---------------------------------");
		int b=1;
		do {System.out.print(b);
		b++;}
		while(b<=30);
		
		int c=70;////even numbers even
		do {System.out.println(c);
		c-=2;
		}
		while (c>=30)
		;
		int a=70; ////odd
		do {
		if(a%2!=0) 
		{System.out.println(a+" ");
		}a--;}while (a>30);
		}
	}


