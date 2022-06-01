package com.syntax.class07;

public class enhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colours = {"pink","blue","white","black"};
for (String colour:colours) 
{System.out.print(colour+" ");}
System.out.println("             ");
int[]numbers= {10,20,30,40};
for(int num:numbers) {System.out.print(num+" ");}


String []disney = {"Shrek","Elsa","Goofy","Mulan"};
int size=disney.length;
System.out.println(size);//4
System.out.println(disney[1]);

String[] iceCream=new String[3];
iceCream[0]="butter pecan";
iceCream[1]="Chocolate";
System.out.println(iceCream[2]);//null
System.out.println(iceCream[1]);//chocolate



	}

}
