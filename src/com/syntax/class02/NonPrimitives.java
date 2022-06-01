package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Oleg";
String lastName="Smith";
long phone=7867349155l;
//xxx-xxx-xxxx
String phoneNumber="786-734-9155";
String address="45 sw 9th street";
String age="30";
//shortcut for printing
//syso+ctrl+space-enter
/*we can use +> works as concatenation operator
 * To attach string to string
 * To attach String to int
 * To attach String to double
 * To attach to any other type
 * 
 */
System.out.println(name+lastName);//OlegSmith
System.out.println(name+" "+lastName);// add" " Oleg Smith
String city="Miami";
System.out.println(name+" "+lastName+" "+"lives in "+city);
//Oleg is 30 years old
System.out.println(name+" "+lastName+" "+"lives in "+city+" he is "+age);







	}

}
