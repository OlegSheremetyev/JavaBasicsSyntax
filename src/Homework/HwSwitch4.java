package Homework;

import java.util.Scanner;

public class HwSwitch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Mom i made it, i can create calculator");
double num1,num2;
System.out.println("enter num 1");
num1=input.nextInt();
System.out.println("enter num2");
num2=input.nextInt();
System.out.println("enter operator");
char operator=input.next().charAt(0);
double rslt=0; 
String rslt2="";
switch(operator) {
	case'+':
		rslt=num1+num2;
		break;
		case'-':
			rslt=num1-num2;
			break;
		case'/':
			rslt=num1/num2;
			break;
		case'*':
			rslt=num1*num2;
			break;
			default :
			rslt2="wrong operator";
} System.out.println("result: "+rslt+" "+rslt2);
			


	
	
	
	
	
	
	
	
	
	}

}
