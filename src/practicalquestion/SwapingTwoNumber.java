package practicalquestion;

import java.util.Scanner;

public class SwapingTwoNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Value of a :");
		int a = sc.nextInt();

		System.out.println("Enter Value of b:");
		int b = sc.nextInt();

		System.out.println("Before Swaping Number " + a + " and  " + b);

		// Without Using third Variable
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swaping Number " + a + " and " + b);

		sc.close();

	}

}
