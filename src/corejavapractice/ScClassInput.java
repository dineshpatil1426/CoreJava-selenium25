package corejavapractice;

import java.util.Scanner;

public class ScClassInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value of a:");
		int a = sc.nextInt();
		System.out.println("Enter Value of b:");
		int b = sc.nextInt();

		System.out.println("Adition of a and b numbers: " + (a + b));
		System.out.println("multiplication of a and b numbers: " + (a * b));
						
		sc.close();
	}

}
