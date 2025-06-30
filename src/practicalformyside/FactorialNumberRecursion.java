package practicalformyside;

//using Recursion Java Program to Find Factorial of a Number Using Recursion
public class FactorialNumberRecursion {

	public static void main(String[] args) {
		
		System.out.println(multiply(5));

	}
	
	public static int multiply(int num) {
		
		if(num>=1) {
			return num *multiply(num-1);
		}else {
			return 1;
		}
	}

}
