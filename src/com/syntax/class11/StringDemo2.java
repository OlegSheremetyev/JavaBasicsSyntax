package com.syntax.class11;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="I am always confused";
		System.out.println(str.indexOf('c'));//12
		System.out.println(str.indexOf("always"));//5
		
		String word="Java is Easy";
		String word2=word.substring(0,4);
		System.out.println(word2);
		System.out.println(word.substring(8,12));
		

	}

}
