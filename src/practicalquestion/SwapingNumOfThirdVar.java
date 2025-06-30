package practicalquestion;

import java.util.Scanner;

public class SwapingNumOfThirdVar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Value of a :");
		int a = sc.nextInt();

		System.out.println("Enter Value of b:");
		int b = sc.nextInt();

		System.out.println("Before Swaping Number " + a + " and  " + b);
		
		//using third Variable

		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println("After Swaping Number " + a + " and " + b);
		
		sc.close();

	}

}
