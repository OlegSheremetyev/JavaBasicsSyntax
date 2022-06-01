package Homework;

public class Variables {

	public static void main(String[] args) {
		/* TODO Create a Java program and name it Variables
		 * In your program create different type of variables to store student’s information(name, last name, grade, city, state, phone number) and then print value of those variables in the format:
My name is ___ and my last name is ____
I am A/B student
I live in city__ and state____
And my phone number is …..
b) Change student’s city, state, phone number and grade. And print those updated values:
Example:
My name is __ and I moved to new city__ and new state__. My new phone number is ___

		 */
		String name="Oleg";
		String lastName="Sheremetyev";
		char grade='A';
		String city="Miami";
		String state="Florida";
		String country="USA";
		long phoneNumber=7867349155l;
		
		System.out.println("My name is "+name +" and my last name is " +  lastName);
	    System.out.println("I live in "+city +" and a state of "+state  );
		System.out.println("And my phone number is "+phoneNumber);
		
		city="Moscow";
		country="Russia";
		phoneNumber=3059037951l;
		grade='b';
		
	    System.out.println("My name was always "+name +" and i moved from "+city+" "+country+" My old phone number was "+phoneNumber);
		
	    /*Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”


Write a program to find the square of the number 3.9. You program should say “The square of the ____ is ____ ”

Write a program to print the area and perimeter of a rectangle with width = 5 and height = 8. Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
	     
*/
	    double square,sum1,sub1,mult1,div1;
	   double a=3.9;
	   square=a*a;
	   sum1=a+a;
	   sub1=a-a;
	   mult1=a*a;
	   div1=a/a;
	   
	   System.out.println("The square of "+ a +" is equal to " +square );
	   System.out.println("The sum of "+ a +" is equal to " +sum1 );
	   System.out.println("The sub of "+ a +" is equal to " +sub1 );
	   System.out.println("The mult of "+ a +" is equal to " +mult1 );
	   System.out.println("The div of "+ a +" is equal to " +div1 );
	   
	   double Perimeter,area;
	   
	   double a1=5;
	   double b1=8;
	   Perimeter=2*(a1+b1);
	   area=a1*b1;
	   System.out.println("The perimeter of a rectangle with width "+ a1 + " " +"and height " +b1+ " is equal to " + Perimeter +" and the area is "+area);
	    
	}

}
