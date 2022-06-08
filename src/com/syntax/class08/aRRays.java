package com.syntax.class08;

public class aRRays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String [] disney = {"Shrek","Elsa","Goofy","Mulan","Tom&Jerry"};
		int sz=disney.length;
		System.out.println(sz);//5
		System.out.println(disney[1]);
		for (int i=0;i<disney.length;i++)
		{
		System.out.print(disney[i]+" ");}
		
		
		
for (String character:disney) {System.out.println(character+"");

	}
System.out.println("------------------------------------");
for (int i=0;i<disney.length;i++)
{if (disney[i].equalsIgnoreCase("Shrek")) {System.out.println(disney[i]+" My fav char");}
else {System.out.println(disney[i]);
}
}
	}}
