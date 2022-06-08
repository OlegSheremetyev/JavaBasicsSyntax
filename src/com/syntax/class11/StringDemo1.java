package com.syntax.class11;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("Oleg");// proper way of creating object from a class
		String name2 = "Oleg";
		name.length();// behavior
		System.out.println(name.length());
		name2 = "Zameer";
		System.out.println(name2.length());

		String firstName = "Adem ";
		String lastName = "Jones";
		String fullName = (firstName + lastName);
		String fullName2 = firstName.concat(lastName);// dont use it
		System.out.println(fullName);
		System.out.println(fullName2);
		String name3 = "";
		System.out.println(name3.isEmpty()); // check if is empty
		String str = " never ";
		System.out.println(str.trim());// removing space at beggining and end

		String search = "Batch 13 is Great";
		System.out.println(search.startsWith("Frozen"));// see if it starts with
		System.out.println(search.endsWith("great"));// see if ends with
		System.out.println(search.toLowerCase().endsWith("great"));
		System.out.println(search.contains("13"));// search if contains
		System.out.println(search.contains("is"));
		System.out.println(search.toLowerCase().contains("batch"));

		String word = "kat";
		String word1 = "KAT";
		System.out.println(word.equals(word1)); // false
		System.out.println(word.equalsIgnoreCase(word1));// true

		String usr = "myusername", psw = "Password123", psw2 = "Password123";

		if (usr.isEmpty())
			System.out.println("Username field can not be empty");
		if (psw.isEmpty())
			System.out.println("Username field can not be empty");
		if (psw.length() < 9)
			System.out.println("Password must be a minimum of 8 charecters");
		if (psw.contains(usr))
			System.out.println("Password can not contain username");
		if (!psw.equals(psw2))
			System.out.println("Passwords do not match");

		if (!usr.isEmpty() && !psw.isEmpty() && psw.length() > 8 && !psw.contains(usr) && psw.equals(psw2)) {
			System.out.println("Your username and password has been created");
		}

		String str1 = "Sameer is gulbadan and he is sheer badan";
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(5));
		int cnt = 0;
		for (int i = 0; i < str1.length(); i++) {
			// System.out.print(str1.charAt(i)); print all

			if ('s' == str1.charAt(i) || 'S' == str1.charAt(i)) {
				cnt++;

			}

		}
		System.out.println("s appeared " + cnt + " in the string");

		String strg = "123456789101112341234";
		int counter = 0;
		for (int i = 0; i < strg.length(); i++) {
			if (strg.charAt(i) == '1') {
				counter++;

			}
		}
		System.out.println("1 appears in string " + counter + " times");
	}
}
