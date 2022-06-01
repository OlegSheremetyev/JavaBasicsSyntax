package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		/*Tuesday or Wednesday Manual testing
		 * Thursday Review class
		 * Saturday Sunday java
	*/
String day="Monday";
if (day.equals("Monday")||day.equals("Friday")) {
	System.out.println("I have no class");
	}else if(day.equals("Tuesday")|| day.equals("Wednesday")) {System.out.println("I have manual calss");
	}else if(day.equals("Thursday")) {System.out.println("I have review class");
	}else if (day.equals("Saturday")|| day.equals("Sunday")) {System.out.println("I have Java class");
		
	}
		
Scanner input= new Scanner(System.in);
System.out.println("Enter person height");
int height=(input.nextInt());
if(height<=60) {System.out.println("Person is short");
}else if(height>=60) {System.out.println("Person is medium");
}else if (height>72) {System.out.println("Person is tall");

int Monday=1;
int Tuesday=2;
int Wednesday=3;
int Thursday=4;
int Friday=5;
int Saturday=6;
int Sunday=7;
}

Scanner input1= new Scanner(System.in);

System.out.println("Enter number");
int wk=(input1.nextInt());

if (wk>=1&&wk<=5) {System.out.println("weekday");
} else if (wk>=6 && wk<=7) {System.out.println("Weekend");

	}  else {System.out.println("Wrong");
		
		}

boolean boo=true;
System.out.println(boo);
boolean traffic=true;
if(!traffic) {System.out.println("Ill make it on time");

}
String name="Emre";
if (!name.equals("Emre")) {System.out.println("You are not Emre");}
	}
} 

	


