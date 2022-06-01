package com.syntax.class08;

public class arrayPractice {

	public static void main(String[] args) {
		
		char[] grade =new char[6];
		grade [0]='A';
		grade [1]='b';
		grade [2]='c';
		grade [3]='d';
		grade [4]='e';
		grade [5]='f';
		System.out.println(grade[1]);
		
		char [] grades= {'a','b','c','d','e','f'};
		System.out.println(grades[1]);
		
		String[] words = {"Java","Saturday","day","coding","is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		char [] grades1= {'a','b','c','d','e','f'};
		System.out.println(grades1[1]);
		for(int i=0;i<grades1.length;i++) {
			System.out.print(grades1[i]+" ");
		}
		System.out.println("         ");
		String[] words1 = {"Java","Saturday","day","coding","is"};
		for(int x=0;x<words.length;x++) {System.out.print(words[x]+" ");}

	}

}
