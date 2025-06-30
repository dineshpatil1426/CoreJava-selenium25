package practicalquestion;

import java.util.Scanner;

public class vowelConsonantCount {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine().toLowerCase();

		int vowelCount = 0;
		int consonantCount = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonantCount++;
			}

		}
		System.out.println("Number of Vowels: " + vowelCount);
		System.out.println("Number of Consonants: " + consonantCount);
		s.close();

	}

}
