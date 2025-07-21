package practicalformyside;

import java.util.Scanner;

//Write a Program to Find Sum of Fibonacci Series Number

public class FibonacciSeriesSum {

	public static void main(String[] args) {

		System.out.println("Enter the Number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int n1 = 0;
		int n2 = 1;
		int i = 1;
		int temp = n1 + n2;
		System.out.print("Sum of Fibonacci Series Number: " + n1 + " + " + n2 + " ");

		while (i <= num) {

			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			temp = temp + n3;

			System.out.print(" + " + n3);
			i++;
		}

		System.out.print(" = " + temp);

		s.close();

	}

}
