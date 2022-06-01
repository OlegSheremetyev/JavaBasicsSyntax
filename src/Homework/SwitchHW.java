package Homework;

import java.util.Scanner;

public class SwitchHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String country,language;
System.out.println("Please enter country you from");
Scanner input=new Scanner(System.in);
country=input.nextLine();
switch(country) {
	case"Spain":
		language="Spanish";
		break;
	case "Usa":
		language="English";
		break;
	case"Russia":
		language="Russian";
		break;
		default:
			language="Uknown";
			
		
}
System.out.println("In "+country+" most popular language is "+language);}




	}


