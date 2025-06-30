package practicalquestion;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number:");
		int num = sc.nextInt();

		// 5! (5 factorial) is 5 * 4 * 3 * 2 * 1 = 120
		int f = 1;

		while (num!=0) {
			f = f * num;
			num--;
		}

		/*
		 * for(int i=num;i>0;i--) { f=f*i; }
		 */

		System.out.println("Factorial Number is : " + f);
		sc.close();
	}

}
