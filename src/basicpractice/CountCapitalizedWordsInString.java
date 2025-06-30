package basicpractice;

import java.util.Scanner;

public class CountCapitalizedWordsInString {
	
	
	static void capitalizedWords(String str) {
		
		int countCapitalized=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				
				countCapitalized++;
			}
		}
		System.out.println("Capitalized Words count is : "+countCapitalized);
		
	}

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=s.nextLine();
		capitalizedWords(str1);		
		s.close();

	}

}
