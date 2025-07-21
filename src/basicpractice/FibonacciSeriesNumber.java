package basicpractice;

import java.util.Scanner;

public class FibonacciSeriesNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");
        
        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 1; i <= n; i++) {
            
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
           
        }

        scanner.close();
		
		
	}

}
