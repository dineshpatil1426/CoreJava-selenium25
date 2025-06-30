package corejavapractice;

import java.util.Scanner;

public class ScClassOtherInput {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);

		/*
		 * // using nextline funcations System.out.println("Enter UserName :"); String
		 * userName=myObj.nextLine();
		 * 
		 * System.out.println("UserName is: "+userName);
		 */

		// using Different funcations

		System.out.println("Enter Name,age, Salary:");

		// String input
		String name = myObj.nextLine();

		// Numerical input
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);

		myObj.close();

	}

}
