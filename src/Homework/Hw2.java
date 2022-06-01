package Homework;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("what is loan amount needed");
		int ma = 200000;
		Scanner input = new Scanner(System.in);
		int loan = (input.nextInt());

		if (loan <= ma) {
			System.out.println("aproved");
		} else {
			System.out.println("Denied");
		}
	System.out.println("--------------------------------------");
	System.out.println("Your City");
	String city =input.next();
	System.out.println("Temperature outside");
	int F=input.nextInt();
	int C=((F-32)*5/9);
	System.out.println(C);
	
	System.out.println("--------------------------------------");
	
	System.out.println("Worked years");
	int years=input.nextInt();
	System.out.println("Salary");
	int salary=input.nextInt();
	if(years>=5) {System.out.println("Eligable");
	if(salary>=5000) {System.out.println("Bonus 5000");
	}else {
		System.out.println("Bonus 3000");}
	
	} else  {System.out.println("Not eliable");}
	
	
	System.out.println("---------------");
	
	
	System.out.println("What time it is");
	int time=input.nextInt();
	if (time>=1&&time<=11) {System.out.println("morning");
	}else if (time>=12&&time<=15) {System.out.println("afternoon");
	}else if (time>=16&&time<=20) {System.out.println("evening");
	}else if 	(time>=21&&time<=24) {System.out.println("night");}
	else {System.out.println("wrong entry");}
	System.out.println("-----------------------");
	
	System.out.println("enter birthday month");
	
	String month=input.next();
    if (month.equals ("January") || month.equals("December") || month.equals("February")) {System.out.println("Winter");
    }else if (month.equals("March")||month.equals("April")||month.equals("May")) 
    {System.out.println("Spring");
	}else if(month.equals("June")||month.equals("July")||month.equals("August")) 
	{System.out.println("Summer");
	}else if((month.equals("September")||month.equals("October")||month.equals("August")))
			{System.out.println("Spring");
	}
    double Quiz=input.nextDouble();
	System.out.println("Mid Term Score?");
	double Term=input.nextDouble();
	System.out.println("Final Score?");
	double Final=input.nextDouble();
	
	double Average=((Quiz+Term+Final)/3);
	
	if(Average>=90) {
		System.out.println("Your grade is A");
		
	}else if(Average>=70&&Average<90) {
		System.out.println("Your grade is B");
		
	}else if(Average>=50&&Average<70) {
		System.out.println("Your grade is C");
		
	}else if(Average<50){
		System.out.println("Your grade is F");}
	}
}


	
	

	
	
	
	
	



