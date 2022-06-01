package HwArray;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// Using Scanner create an array of integer values. 
	//After the array is created, calculate the sum of all stored elements in that array.
Scanner input=new Scanner(System.in);
		int num[]=new int[5];
int sum=0;
int i=0;
for(i=0;i<num.length;i++) {System.out.println("enter a number");
num[i]=input.nextInt();
sum=sum+num[i];
}
System.out.println(sum);
	
	
	
	
	
	
	
	
	
	
	}

}
