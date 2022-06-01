package HwArray;

public class array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//write a java program to check whether a given number is prime or not
		
		int num=13; //assigning variable
		boolean prime=true;
		for(int i=2;i<num;i++)
		{if(num%i==0) {prime=false;
		break;
		}
		}
		if(prime) {
			System.out.println(num+" is a prime number");}
		else {System.out.println(num+" is not a prime number");
		}
	

}
}