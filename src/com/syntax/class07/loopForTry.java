package com.syntax.class07;

public class loopForTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum2 = 0;
		for (int x = 1; x <=70; x++) {
			if (x % 2 != 0) {
				sum2 += x;

			}
		}
		System.out.print(sum2 + " ");

		int sum = 0;
		for (int y = 1; y <=70; y++) {
			if (y % 2 == 0) {
				sum += y;

			}

		}

		System.out.print(sum + " ");
	}
}
