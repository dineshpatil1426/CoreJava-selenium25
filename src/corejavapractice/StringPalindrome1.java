package corejavapractice;

import java.util.Scanner;

public class StringPalindrome1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = s.next();
		String orgstr = str;
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);

		}
		if (reverse.equals(orgstr)) {
			System.out.println("String is Palindrome1");
		} else {
			System.out.println("String is not Palindrome1");
		}
		s.close();
	}

}
