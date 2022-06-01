package com.syntax.class09;

public class AllElementsFrom2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] usa = { { "New York", "Albany", "Buffalo" }, // 0
				{ "La", "Sf", "San Jose", "San Diego", "Redding" }, // 1
				{ "Miami", "Orlando", "Niceville", "Tampa" }, // 2
				{ "McLean", "Richmond", "Leesburg" }// 3
		};
		for (int row = 0; row < usa.length; row++) {
			for (int col = 0; col < usa[row].length; col++) {
				System.out.print(usa[row][col] + " ");
			}
		}
		int[][] nums = { { 1, 2, 3, 4, 5 }, { 199, 300, 588, 700 }, { 1900, 4578, 98787 } };
		// i loop iterates over rows
		// nums.length gives# of arrays inside 2 d arra=3
		// j loop iterates over columns

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println("=====");
		}
		
		
for (int[] num:nums) {
	for(int n:num) {System.out.print(n+" ");}
}
System.out.println("========");

String[][] usa1 = { { "New York", "Albany", "Buffalo" }, // 0
		{ "La", "Sf", "San Jose", "San Diego", "Redding" }, // 1
		{ "Miami", "Orlando", "Niceville", "Tampa" }, // 2
		{ "McLean", "Richmond", "Leesburg" }// 3
};
for (int row = 0; row < usa.length; row++) {
	for (int col = 0; col < usa1[row].length; col++) {
		System.out.print(usa1[row][col] + " ");
	}
	for (String[]state:usa1) {for (String city:state) {System.out.print(city+" ");}}
}









	}
}
