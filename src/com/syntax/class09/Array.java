package com.syntax.class09;

public class Array {

	public static void main(String[] args) {
		// create array to store double
		
		
		double[] num= {2.99,3.99,4.99,5};
		for (double x:num) {System.out.println(x+" ");}
System.out.println();
for(int i=0;i<num.length;i++) {System.out.println(num[i]+"");}

System.out.println("========================");
int sum=0;
int[]numbers= {10,222,3,4,5};
for (int i=0;i<numbers.length;i++)
{sum=sum+numbers[i];}
System.out.println(sum);
System.out.println("===========================");


int[] num1= {2,4,5,10};
for(int i=0;i<num1.length;i++)
{if(num1[0]>num1[1]&&num1[0]>num1[2]&&num1[0]>num1[3]) {System.out.println(num1[0]);
	
	}else if(num1[1]>num1[2]&&num1[1]>num1[3]) {System.out.println(num1[1]);}
	else if (num1[2]>num1[1]&&num1[2]>num1[3]){System.out.println(num1[2]);}
	else {System.out.println(num1[3]);}



}}

}

