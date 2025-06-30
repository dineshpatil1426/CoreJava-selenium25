package practicalquestion;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.println("Enter the Number:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		int n1 = 1;
		int n2 = 1;
		int i = 1;
		System.out.print("Fibonacci Series is : " + n1 + " " + n2 + " ");
		
		while (i <= num) {
			int n3;

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3 + " ");
			i++;
		}
		s.close();

	}

}
