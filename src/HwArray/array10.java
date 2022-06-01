package HwArray;

public class array10 {

	public static void main(String[] args) {
		
		
		//Write a java program to find the second largest number in the array?
		
		
		
int [] numbers= { 1,4,6,8,10,14};
int lrg1=0; int lrg2=0;

for(int i=0;i<numbers.length;i++) {if(numbers[i]>lrg1) {
	lrg2=lrg1;
	lrg1=numbers[i];
}else if(numbers[i]>lrg2) {lrg2=numbers[i];}

	
}
System.out.println(lrg2);

	}

}
