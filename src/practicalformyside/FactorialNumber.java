package practicalformyside;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Factorial Number: ");

		int num = s.nextInt();
		int f = 1;
		while (num != 0) {
			f = f * num;
			num--;
		}
		System.out.println("Factorial Number is :" + f);
		s.close();
		
		
		System.out.println("-----------------");
		//Using for Loop
		int num1=5;
		int fact=1;
		
		for(int i=1;i<=num1;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+num1+" Number is :" + fact);
		
	}

}
