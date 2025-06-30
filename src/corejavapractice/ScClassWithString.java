package corejavapractice;

import java.util.Scanner;

public class ScClassWithString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Name :");
		String fn=sc.next();
		System.out.println("Enter Last Name :");
		String ln=sc.next();
		
		System.out.println("Full Name is : "+fn+" "+ln);
		sc.close();
	}

}
