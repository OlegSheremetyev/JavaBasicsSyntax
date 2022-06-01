package Homework;

import java.util.Scanner;

public class HwSwitch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input=new Scanner(System.in);
	Double price,discount,finalPrice;
	System.out.println("Is there a sale going on?");
	String sale=input.next();
	if (sale.equalsIgnoreCase("yes")) {System.out.println("What would you like today");
    String item=input.next();
    System.out.println("What is the price");
    price=input.nextDouble();
    if(price<=20) {discount=(10.0); finalPrice=(price-(price*0.1));
    }else if (price>20&&price<=100) {discount=20.0; finalPrice=(price-(price*0.2));
    }else if(price>100&&price<=500) {discount=(30.0); finalPrice=(price-(price*0.3));
    }else  {discount=(50.0); finalPrice=(price-(price*0.5));}
    System.out.println("After discount "+discount+" the price of the item "+item+" is reduced from "+price+" to "+finalPrice);
} else {System.out.println("No shopping today");}
	}
}
