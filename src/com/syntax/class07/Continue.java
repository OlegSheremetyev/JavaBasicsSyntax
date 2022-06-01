package com.syntax.class07;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) 
		{System.out.println("hello");//5 times
		if(i==2)
		{
		continue; 
		}
		
		System.out.println(i+"");
		System.out.println("hello");
		System.out.println("we are going to have break");
	}
// print numbers 1 to 10 except 5 7 
		for (int i=1; i<10;i++) {
			if (i==5||i==7) {
				continue;}
			{System.out.print(i+" ");
			
			}
		}
}
}
