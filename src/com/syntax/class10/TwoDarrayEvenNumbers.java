package com.syntax.class10;

public class TwoDarrayEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {{10,15,20},
			      {25,30,35},
			     {40,45,50,55}
	};   
		for (int j=0;j<arr.length;j++) {
			for (int i=0;i<arr[j].length;i++) {
				if(arr[j][i]%2==0) {System.out.println(arr[j][i]);
			}
				

				}
		}}}
