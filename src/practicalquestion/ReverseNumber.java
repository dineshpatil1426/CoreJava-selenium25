package practicalquestion;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number For reverse :");
		int num = sc.nextInt();

		int rem;
		int sum = 0;

		while (num != 0) {
			
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;

		}
		System.out.println("Reverse number is: " + sum);
		sc.close();
	}

}
