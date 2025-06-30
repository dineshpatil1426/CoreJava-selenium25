package corejavapractice;

public class SlitFuncation {

	public static void main(String[] args) {

		// Simple Slit Program

		String s1 = "abcd xyz 1111 2222 234 klm mnopq";

		String[] arr = s1.split(" ");
	
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}
		//new Logic for Loop
		
		/*
		for(String str1:arr) {
			System.out.println(str1);
		}
		*/
		
		// Slit in reverse order

		String s2 = "Dinesh QA";

		String[] arr1 = s2.split(" ");

		for (int i = arr1.length - 1; i >= 0; i--) {

			System.out.println(arr1[i] + " ");
		}
		

		// Text reverse by order CharAt method

		for (int i = s2.length() - 1; i >= 0; i--) {
			System.out.println(s2.charAt(i));
		}

		// Prepare program to split variable into multiple sub strings and print strings
		// which length is only 3.

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i].length()==3) {
				System.out.println(arr[i]);
			}
		}
	}

}
