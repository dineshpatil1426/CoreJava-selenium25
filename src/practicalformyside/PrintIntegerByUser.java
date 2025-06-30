package practicalformyside;

import java.util.Scanner;

public class PrintIntegerByUser {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Pls enter a number:");
		int num=s.nextInt();
		
		System.out.println("Your Entered:"+num);
		s.close();
	}

}
