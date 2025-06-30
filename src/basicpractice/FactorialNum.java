package basicpractice;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter Factorial Number: ");
		
		int num=s.nextInt();
		int f=1;
		while(num>0) {
			f=f*num;
			num--;
		}
		System.out.println("Factorial Number is :" + f);
		s.close();
	}

}
