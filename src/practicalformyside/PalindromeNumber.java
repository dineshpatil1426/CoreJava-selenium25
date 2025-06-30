package practicalformyside;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("pls  enter a number: ");
		int num=s.nextInt();
		
		int rem;
		int sum=0;
		int atualNum=num;
		
		while(num!=0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		
		if(atualNum==sum) {
			System.out.println("it's Palindrome Number ");
		}else {
			System.out.println("it's Not Palindrome Number ");
		}
		s.close();
	}

}
