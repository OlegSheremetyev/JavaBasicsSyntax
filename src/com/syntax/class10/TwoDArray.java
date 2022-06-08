package com.syntax.class10;

public class TwoDArray {

	public static void main(String[] args) {
		// create 2D array of integer
		//print the sum of all numbers
		int[][] arr= {{10,15,20},
				      {25,30,35},
				     {40,45,50,55}
		};   
System.out.println(arr[0][0]);
System.out.println(arr[0][1]);
System.out.println(arr[0][2]);
System.out.println(arr[2][3]);
int sum=0;

for (int j=0;j<arr.length;j++) {
for (int i=0;i<arr[j].length;i++) {
	sum=sum+arr[j][i];}

	}
System.out.print(sum);
}}
