package practicalquestion;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.next();
		String Revesrse="";
		
		
		for(int i=str.length()-1;i>=0;i--) {
			
			char ch;
			ch=str.charAt(i);
			Revesrse+=ch;
			
		}
		
		if(Revesrse.equals(str)) {
			System.out.println("It's Palindrome String");
			System.out.println(Revesrse);
		}else {
			System.out.println("It's not Palindrome String");
			System.out.println(Revesrse);
		}

		s.close();
	}

}
