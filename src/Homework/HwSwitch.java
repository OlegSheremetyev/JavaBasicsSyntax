package Homework;

import java.util.Scanner;

public class HwSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String country, favoriteFood;
		
		System.out.println("Please tell me where are you from");
		country=scan.nextLine();
		
		switch(country) {
		
		case "Mexico":
			favoriteFood="Tacos";
			break;
		case "Afghanistan":
			favoriteFood="Kabab";
			break;
		case "India":
			favoriteFood="Biryani";
			break;
		case "Canada":
			favoriteFood="Poutine";
			break;
		case "Turkey":
			favoriteFood="Lahmacun";
			break;
		case "Pakistan":
			favoriteFood="Pati Chai";
			break;
		case "Egypt":
			favoriteFood="Koshary";
			break;
		case "USA":
			favoriteFood="Burger";
			break;
			default:
			favoriteFood="Unknow";
	}
System.out.println(favoriteFood);
	}
}
