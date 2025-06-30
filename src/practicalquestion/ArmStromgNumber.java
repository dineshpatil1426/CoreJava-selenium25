package practicalquestion;

import java.util.Scanner;

public class ArmStromgNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		//String numberstr=Integer.toString(num);
		//int numLenght=numberstr.length();

		int rem;
		int sum = 0;
		int total = num;
		//For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153 
		// Other Armstrong number are 370,371,407

		while (num != 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem );
			//Using Math Class
			//sum=sum+Math.pow(rem, numLenght);
			num = num / 10;
		}
		if (sum == total) {
			System.out.println("It's  ArmStromg Number ");
		} else {
			System.out.println("It's Not ArmStromg Number ");
		}
		sc.close();
	}

}
