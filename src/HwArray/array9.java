package HwArray;

public class array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//maximum and minimum number in array
		
		int[]num = {100,260,80,-35,95,17};
		int max=num[0];
		int min=num[0];
		for (int n=1;n<num.length;n++) {
			if(num[n]>max) {max=num[n];}
			if(num[n]<min) {min=num[n];
			{min=num[n];
			}
		}
		System.out.println("The largest number in the array is "+max);
		System.out.println("The smallest number in the array is "+min);
		System.out.println("=========================");
		
		
		max=num[0];
		min=num[0];
		for (int number:num) {
			if (number>max) {
				max=number;}
			if(number<min) {
				min=number;
			}
		}
		System.out.println("The largest number in the array is "+max);
		System.out.println("The smallest number in the array is "+min);
	}

}}
