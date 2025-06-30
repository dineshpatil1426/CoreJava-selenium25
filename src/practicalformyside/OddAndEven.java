package practicalformyside;

import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter a Number:");
		int num=s.nextInt();
			
			if(num%2==0) {
				System.out.println(num+ " is Even Number");
			}else {
				System.out.println(num+ " is Odd Number");
			}
		s.close();

	}

}
