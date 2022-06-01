package com.syntax.class09;

public class TwoDiminssionsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] numbers= new int[3][4];
numbers [0] [0]=10;
numbers [0] [1]=20;
numbers [0] [2]=30;
numbers [0] [3]=40;
//2 raw
numbers [1] [0]=1;
numbers [1] [1]=2;
numbers [1] [2]=3;
numbers [1] [3]=4;
//3 row
numbers [2] [0]=9;
numbers [2] [1]=8;
numbers [2] [2]=7;
numbers [2] [3]=6;
System.out.println(numbers[1][3]);//4
System.out.println(numbers[0][1]);//20
int rows=numbers.length;
System.out.println("number of rows= "+rows);//number of rows
int colsof1row=numbers[0].length;
System.out.println("number of cols in 1 row = "+colsof1row);//number of column in specific row

//1 array=>Ny>all cities of Ny ctate
//2 array>Ca>all cities of Ca state
//3 array>Fl>all cities of Fl state
//4 array>Va>all cities if Va state


String[][] usa= {
		{"New York","Albany","Buffalo"},//0
		{"La","Sf","San Jose","San Diego","Redding"},//1
		{"Miami","Orlando","Niceville","Tampa"},//2
		{"McLean","Richmond","Leesburg"}//3
		};System.out.println(usa[1][2]);//SanJose
		System.out.println(usa[2][0]);// Miami
		System.out.println("total # of 1D arrays in arrays usa= "+usa.length);//4
		//i want to see how many elements inside 1array
		int num1array=usa[0].length; System.out.print("Number of elements in 1 array equals to "+num1array);//3
		int num2array=usa[1].length; System.out.print("Number of elements in 2 array equals to "+num2array);//5
		

	}

}
