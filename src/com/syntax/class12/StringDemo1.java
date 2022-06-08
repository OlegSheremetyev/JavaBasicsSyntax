package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Batch 13 is good  actually very good";//replace good with great
		System.out.println(str.replace("good", "Great"));
		System.out.println(str.replace("g","G"));
		System.out.println(str.replaceFirst(str,str));
		System.out.println(str.replaceFirst("g","G"));
		
		System.out.println("--------------------------------------------------------------------------------------------");
		String word="131231aadAfaAdaAD*&^*&^*&";
		System.out.println(word.replaceAll("[0-9]", "#"));//replace numbers
		System.out.println(word.replaceAll("[a-z]","#"));// replace lower case letters
		System.out.println(word.replaceAll("[A-Z]","#"));//replace Upper case letters
		System.out.println(word.replaceAll("[A-Za-z]","#"));//replace both upper case and lower case
		System.out.println(word.replaceAll("[A-Za-z0-9]","#"));//replace both letters and numbers
		System.out.println(word.replaceAll("[A-Za-z]","#"));
		System.out.println(word.replaceAll("[^a-z]","#"));// replace but NOT
		System.out.println(word.replaceAll("[^a-zA-Z0-9]","#"));// not the speacial
	String	word1="abcdefghijklmnopqrstuvwxyz";
	System.out.println(word1.replaceAll("[a-f]", "*")); 
	System.out.println(word.replaceAll("[^A-Za-z0-9]",""));//remove special char
	System.out.println(word.replaceAll("[^A-Za-z0-9]","")); //regexr.com    //ascII  //stackoverflow.com
		
	}

}
