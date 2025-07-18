package basicpractice;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		/*
		 * StringBuilder sb = new StringBuilder("Java"); sb.append(" Programming");
		 * System.out.println(sb);
		 */
		/*
		 * String s1="naveen"; String s2=s1.replace('n', 'N'); String s3=new
		 * String("NaveeN"); System.out.println(s3==s2);
		 */

		/*
		 * 
		 * // Find duplicate char from string. Write a program to find duplicate
		 * characters in a given String.
		 * 
		 * // Input: hackerearth // Output: h a e r
		 * 
		 * String str="hackerearth"; String str1=""; String[] arr=str.split("");
		 * 
		 * for(int i=0;i<arr.length;i++) { for(int j=i+1;j<arr.length;j++) {
		 * if(arr[i].equals(arr[j])) { System.out.print(arr[i]+" "); } } }
		 */

		/*
		 * // Remove duplicate char from string: Write a program to remove duplicate
		 * characters in a given String.
		 * 
		 * //Input: hackerearth //Output: hackert
		 * 
		 * String str="hackerearth"; String str1=""; String[] arr=str.split("");
		 * 
		 * for(int i=0;i<arr.length;i++) { if(!str1.contains(arr[i])) {
		 * str1=str1+arr[i]; } }
		 * 
		 * System.out.println(str1 +" ");
		 * 
		 */

		/*
		 * //Revere string: Write a program to reverse a given string.
		 * 
		 * //Input: This is a string //Output: gnirts a si sihT
		 * 
		 * 
		 * String revese="This is a string"; String[] arr=revese.split("");
		 * 
		 * for(int i=arr.length-1;i>=0;i--) { System.out.print(arr[i]); }
		 */
		/*
		 * //String count of non-space chracter: Write a program to calculate the count
		 * of non-space characters in a string.
		 * 
		 * //Input: This is a string //Output: 13
		 * 
		 * String str="This is a string"; String[] arr=str.split(""); int count=0;
		 * 
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * if(!arr[i].equals(" ")) { count++; } }
		 * 
		 * System.out.println(count);
		 */

		/*
		 * //Swap two string using Substring: Write a program to swap the two strings
		 * using substring.
		 * 
		 * //Input: Hello world //Output: World Hello
		 * 
		 * 
		 * String str="Hello world"; String[] arr=str.split(" ");
		 * 
		 * for(int i=arr.length-1;i>=0;i--) { System.out.print(arr[i]+" "); }
		 * 
		 * //using Substring
		 * 
		 * String string1 = "Hello"; String string2 = "World";
		 * 
		 * string1 = string1 + string2; string2 = string1.substring(0, string1.length()
		 * - string2.length()); string1 = string1.substring(string2.length());
		 * 
		 * System.out.println(string1); System.out.println(string2);
		 */

		/*
		 * //Swap two string using temp variable: Write a program to swap the two
		 * strings using temp variable.
		 * 
		 * // Input: Hello world // Output: World Hello
		 * 
		 * String string1 = "Hello"; String string2 = "World";
		 * 
		 * String temp=string1; string1=string2; string2=temp;
		 * 
		 * System.out.print(string1+" "); System.out.print(string2);
		 * 
		 */

		/*
		 * // Swap two string using String Builder: Write a program to swap the two
		 * strings // using StringBuilder class.
		 * 
		 * // Input: Hello world // Output: World Hello
		 * 
		 * String string1 = "Hello"; String string2 = "World";
		 * 
		 * StringBuffer sf = new StringBuffer(string1);
		 * 
		 * sf.append(string2);
		 * 
		 * string2 = sf.substring(0, string1.length()); string1 =
		 * sf.substring(string2.length());
		 * 
		 * System.out.println(string1); System.out.println(string2);
		 */

		/*
		 * // Swap two number: Write a program to swap the two numbers using the
		 * substring method.
		 * 
		 * // Input: 10 20 // Output: 20 10
		 * 
		 * 
		 * int a=10; int b=20;
		 * 
		 * System.out.print("Before swaping :"+a+" "+b);
		 * 
		 * a=a+b; b=a-b; a=a-b;
		 * 
		 * System.out.println(); System.out.print("After swaping :"+a+" "+b);
		 */

		/*
		 * //Chek prime number: Write a program to check whether the given number is
		 * prime or not
		 * 
		 * //Input: 7 //Output: prime
		 * 
		 * int num=7; int temp=0;
		 * 
		 * for(int i=2;i<7;i++) { if(num%i==0) { temp++; } }
		 * 
		 * if(temp==0) { System.out.println("It's prime Number "); }else {
		 * System.out.println("It's prime Number "); }
		 */

		/*
		// Check leap year: Write a program to check whether the year is leap or not.

		// Input: 2020
		// Output: Leap

		int year = 2027;
		boolean isleap = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isleap = true;
				} else {
					isleap = false;
				}

			} else {
				isleap = true;
			}

		} else {
			isleap=false;	
		}
		
		if(isleap) {
			System.out.println("Leap");
		}else {
			System.out.println("Not Leap");
		}
       */
		
		// Write a Java program to print a Fibonacci sequence using recursion
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int a=0;
		int b=1;
		
		for(int i=0;i<n;i++) {
			System.out.print(a+",");
			int next=a+b;
			a=b;
			b=next;
			
		}
		
		
		
		
	}

}
