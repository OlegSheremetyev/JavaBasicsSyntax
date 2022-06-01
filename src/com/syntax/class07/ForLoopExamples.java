package com.syntax.class07;

public class ForLoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 90; i++) {
			System.out.println(i + " ");
		} // START POINT END POINT INCREMENT/DECREMNT
		for (int i1 = 60; i1 >= 10; i1--) {
			System.out.print(i1 + " ");
		}
		for (int i2 = 5; i2 <= 40; i2 += 5) {
			System.out.print(i2 + " ");
		}

		for (int a = 1; a <= 100; a++) {
			System.out.print(a + " ");
		}
		for (int b = 100; b >= 1; b--) {
			System.out.print(b + " ");
		}
		for (int c = 19; c <= 1; c += 2) {
			System.out.println(c + " ");
		}
		for (int d = 19; d <= 50; d ++) {
			if(d%2!=0){
			System.out.println(d + " ");
		}
		}

		for (int e = 19; e <= 50; e += 3) {
			System.out.println(e + " ");
		}
		int sum=0;   //// sum=15
		for (int i=1; i<6;i++) {
			sum+=i;
		}
System.out.println(sum);


int sum1=0;   //// sum 1 3 6 10 15
for (int i1=1; i1<6;i1++) {
	sum1+=i1;
	System.out.print(sum1+" ");} //1361015


int sum2=0;
for (int x = 1; x < 70; x ++) {
	if(x%2!=0){sum2+=x;
	System.out.println(sum2 + " ");
}




	}
	
	

}
}
