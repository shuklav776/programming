package com.java.programming.string;

import java.util.Scanner;

// Def: a	sentence	containing	every	letter	of	the	alphabet.
public class Panagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string: ");
		String str = sc.nextLine();
		str = str.replaceAll("\\s", "");
		Boolean isPanagram = checkString(str.toLowerCase());
		if (isPanagram) {
			System.out.println("String is Panagram.");
		} else
			System.out.println("String is not Panagram.");
		sc.close();
	}

	private static Boolean checkString(String str) {
		if (str.length() < 26) {
			return Boolean.FALSE;
		}
		String newStr = "";

		for (char i = 'a'; i >= 'a' && i <= 'z'; i++) {
			if (str.indexOf(i) != -1) {
				newStr = newStr + i;
			}
		}

		if (newStr.length() == 26) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

}
