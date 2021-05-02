package com.java.programming.string;

import java.util.Scanner;

public class Anagram {

	private static String removeSpaces(String str) {
		char[] chArray = str.toCharArray();
		String newString = "";
		for (char ch : chArray) {
			if (ch != ' ') {
				newString = newString + ch;
			}
		}
		return newString;
	}

	private static Boolean compare(String strFirst, String strSecond) {

		if (strFirst.length() != strSecond.length()) {
			return Boolean.FALSE;
		} else {
			strFirst = toLowerCase(strFirst);
			strSecond = toLowerCase(strSecond);
			strFirst = sort(strFirst);
			strSecond = sort(strSecond);
			char[] chArrFirst = strFirst.toCharArray();
			char[] chArrSecond = strSecond.toCharArray();

			for (int i = 0; i < chArrFirst.length; i++) {
				if (chArrFirst[i] != chArrSecond[i]) {
					return Boolean.FALSE;
				}
			}
			return Boolean.TRUE;
		}
	}

	private static String toLowerCase(String str) {

		char[] chArray = str.toCharArray();
		String newStr = "";
		for (char ch : chArray) {
			if (ch >= 65 && ch <= 90) {
				newStr = newStr + ((char) (ch + 32));
			} else {
				newStr = newStr + ch;
			}
		}
		return newStr;
	}

	private static String sort(String str) {
		char[] chArray = str.toCharArray();
		for (int i = 0; i < chArray.length - 1; i++) {
			for (int j = i + 1; j < chArray.length; j++) {
				if (chArray[i] > chArray[j]) {
					char ch = chArray[i];
					chArray[i] = chArray[j];
					chArray[j] = ch;
				}
			}
		}
		String newStr = new String(chArray);
		return newStr;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first string: ");
		// Mother in law
		String strFirst = scanner.nextLine();
		System.out.println("Enter second string: ");
		// Hitler Woman
		String strSecond = scanner.nextLine();
		strFirst = removeSpaces(strFirst);
		strSecond = removeSpaces(strSecond);
		Boolean isAnagram = compare(strFirst, strSecond);
		if (isAnagram) {
			System.out.println("String is Anagram.");
		} else {
			System.out.println("String is not an Anagram.");
		}
		scanner.close();
	}
}
