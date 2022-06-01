package HwArray;

public class HwArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.
	
	int [][] numbers= {{1,2,3,4,5},{10,20,30}};
	int sumE=0;
	int sumO=0;
	for(int[]i:numbers) {
		for(int j:i) {
			if (j%2==0) {sumE+=j;
			}else {sumO+=j;}}
			}
	System.out.println("Sum of odd numbers is "+sumO);
	System.out.println("Sum of even numbers is "+sumE);
	
	int[][] array= {{1,2,3,45},{10,20,30}};
	int sumE1=0;
	int sumO1=0;
	for (int a=0;a<array.length;a++) {for (int b=0;b<array[a].length;b++) {if (array[a][b]%2==0) {sumE1+=array[a][b];
	}else {sumO1+=array[a][b];
	}
	
	}
	
	
		}
	System.out.println("Sum of odd numbers is "+sumO1);
	System.out.println("Sum of even numbers is "+sumE1);
	
	}}
	





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	