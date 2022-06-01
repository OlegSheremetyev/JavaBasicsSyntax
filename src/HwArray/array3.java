package HwArray;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] numbers={ {1,3,4,5,9},{2,3,3,6,9},{7,6,5,4,3}};
		int sum=0;
		for(int i=0; i<numbers.length; i++) 
		{for(int j=0; j<numbers[0].length; j++) {sum+=numbers[i][j];}
		}
System.out.println("sum: "+sum);
	}

}
