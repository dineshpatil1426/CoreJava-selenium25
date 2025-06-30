package practicalquestion;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		//Examples: 121, 1221, 1331, and 12321 are all palindromes 
		
		int rem;
		int sum=0;
		int total=num;
		
		while(num>0) {
			
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		
		if(sum==total) {
			System.out.println("It's Palindrome Number");
		}else {
			System.out.println("It's Not Palindrome Number ");
		}
		sc.close();
	}

}
