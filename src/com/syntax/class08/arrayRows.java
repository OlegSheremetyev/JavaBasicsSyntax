package com.syntax.class08;

public class arrayRows {

	public static void main(String[] args) {
		// creating array
		
		int[] b=new int[4];
		
		//stores values
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		
		//access values from my array
		System.out.println(b[1]);//85
		System.out.println(b[1]+b[3]);//185
		
		//We need to create an array of my classmates
		
		String[] classMates=new String[5];
		classMates[0]="Khrystyna";
		classMates[1]="Sameer";
		classMates[2]="Elexia";
		classMates[3]="Oleg";
		classMates[4]="Adem";

		System.out.println("My classmate name is "+classMates[3]);
		
		double[] price=new double[4];
		price[0]=1.99;
		price[1]=2.99;
		price[2]=3.99;
		price[3]=4.99;
		
		
		String[] fruits= {"mango","apple","kiwi","pear"};
		System.out.println(fruits[2]);//kiwi
	//fruits[4]="peach"; error
		System.out.println("My favouritre fruit is "+fruits[0]); //mango
		
		//i want to find a size of an array
		
		int size=fruits.length;
		System.out.println(size);
	
	
	
	}

}
