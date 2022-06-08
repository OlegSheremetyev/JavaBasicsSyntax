package com.syntax.class12;

public class SugestAnameForAbaby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String father="Sameer";
String mother="Taylor Swift";
boolean boy=false; //true=boy;false=girl;
if(boy) {
	String firstHalf=father.substring(0,father.length()/2);
	System.out.println(firstHalf);
	String secondHalf=mother.substring(mother.length()/2);// take half of String
System.out.println(secondHalf); 
System.out.println(firstHalf.trim()+secondHalf.trim());// trim to remove spaces
}else {String firstHalf=mother.substring(0,mother.length()/2);
System.out.println(firstHalf);
String secondHalf=father.substring(father.length()/2);// take half of String
System.out.println(secondHalf); 
System.out.println(firstHalf.trim()+secondHalf.trim());// trim to remove spaces
}







}

}
