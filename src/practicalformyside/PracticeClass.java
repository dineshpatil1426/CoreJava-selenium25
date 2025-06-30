package practicalformyside;

import java.util.Scanner;

public class PracticeClass {

	// private static int numberDayOfWeek = 6;

	public static void main(String[] args) {

		// Q.1
		/*
		 * for(int i=1;i<=5;i++){ int temp=i; temp=temp*i;
		 * System.out.println(i+"-"+temp); }
		 */

		/*
		 * //Q.2 int a=9; int b=12; System.out.println(a*b);
		 */

		/*
		 * System.out.println("Amigo"); System.out.println("10/18/2025");
		 */

		/*
		 * Scanner s1= new Scanner(System.in); int num1=s1.nextInt(); int
		 * num2=s1.nextInt();
		 * 
		 * System.out.println(num1+num2); System.out.println(num1*num2); s1.close();
		 */

		/*
		 * Scanner s= new Scanner(System.in);
		 * System.out.println("Enter the First Number:"); int number1 =s.nextInt();
		 * System.out.println("Enter the Second Number:"); int number2=s.nextInt();
		 * 
		 * if(number1 >number2) { System.out.println("Different Two numbers :  " +
		 * (number1-number2)); }else {
		 * System.out.println("Number 1 is not Greater then Number2"); }
		 * 
		 * s.close();
		 */

		/*
		 * Scanner s= new Scanner(System.in);
		 * System.out.println("Enter the First Number:"); int number1 =s.nextInt();
		 * System.out.println("Enter the Second Number:"); int number2=s.nextInt();
		 * 
		 * if(number1 * number2 > 0) { System.out.println(number1*number2); }else {
		 * System.out.println(number1+number2); } s.close();
		 */
		/*
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Enter the First Number:"); int number = s.nextInt();
		 * 
		 * if (number / 1000 > 0) { System.out.println("We can't able Convert"); } else
		 * if (number / 100 > 0) { int number1 = number % 10; int number2 = number / 10
		 * % 10; int number3 = number / 100 % 10;
		 * System.out.println(number1+number2+number3); }else if(number /10 >0) { int
		 * number1 = number % 10; int number2 = number / 10 % 10;
		 * System.out.println(number1*number2); }else { System.out.println(number); }
		 */
		/*
		 * boolean isWeekEnd = numberDayOfWeek > 0 && numberDayOfWeek < 6;
		 * System.out.println(isWeekEnd);
		 */

		/*
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Enter the First Number:"); int number = s.nextInt(); int
		 * i=1; int sum=0; /* if(number >0) { while(number>i) { sum=sum+i; i++; }
		 * 
		 * for(i=1;i<number;i++) { sum+=i; } System.out.println(sum);
		 */
		/*
		System.out.println("Enter the First Number:");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int digit;
		int result = 1;
		while (number > 0) {
            
		 	digit=number % 10;
			result =result * digit;
			number = number / 10;
			
		}
		System.out.println(result);
		s.close();
		*/
		/*
		System.out.println("Enter the First Number:");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int rem;
		int sum=0;
		while (number >0) {
			
			rem=number %10;
			sum=sum*10+rem;
			number=number/10;
		}
		System.out.println(sum);
		s.close();
		*/
		
		Client obj= new Client();
		
	}

	public static class Client {
        String name;
        String [] socialMedia;
        int age;
        int money;
    }
}
