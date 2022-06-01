package HwArray;

public class array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		System.out.println("Here we have an array");
		int[][] swapnums= {{23,33,11},{123,44,1112}};
		//printing row with numbers
		for(int[]num:swapnums) {
			for(int n:num) {System.out.print(n+" ");}
			System.out.println("  ");}
		
		//Lets swap 2 numbers first from 1st column and 1st form 2nd column
		
		System.out.println("Lets swap 2 numbers first from 1st column and 1st form 2nd column");
		
		swapnums[0][0]=swapnums[0][0]+swapnums[1][0];
		swapnums[1][0]=swapnums[0][0]-swapnums[1][0];
		swapnums[0][0]=swapnums[0][0]-swapnums[1][0];
		//final print of result
		for(int[]num:swapnums) {
			for (int n:num) {
				System.out.print(n+" ");
			}
		}
	}

}
