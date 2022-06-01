	package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 1;

		if (vaccine) {
			System.out.println("Let me check if you got the second dose");
			if (dose == 1) {
				System.out.println("you need 1 more dose");
			} else {
				System.out.println("You are fully vaccinated");

				System.out.println("------------");
			}
			{

				String month = "May";
				int day = 8;
				if (month.equals("May")) {
					System.out.println("let me check what is today's date");
				}
				if (day == 8) {
					System.out.println("today is a Mother's day");
				} else if (month.equals("june")) {
					System.out.println("-------");
				}
				{boolean didRepl=true;
				int repls=17;
				if(didRepl) {
					System.out.println("How many asigments have you done");
					}else {
						System.out.println("You should do more repl");
					}
				if (repls>15) {
					System.out.println("Greatjob");
				}else if (repls>10) {
					System.out.println("You did a good job");
				}else {
					System.out.println("Please complete more repl");
				}
				
				}
			}
		}
	}
}
