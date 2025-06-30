package corejavapractice;

public class SlitFuncationPracatical {

	public static void main(String[] args) {

		String a = "abcd";

		String b = "xyz";

		String c = "abcd xyz klmn 1234 4567";

		System.out.println("**********************Question-1**********************");

		// length of the a variable should be greater than length of b and should be
		// less than length of c

		if (a.length() >= b.length() && a.length() <= c.length()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		System.out.println("**********************Question-2**********************");
		// concatenate a and b variables and verify length should be less than c
		// variable length or greater than 5

		String ConcateVariable = a.concat(b);
		System.out.println("Length of Concate Variable : " + ConcateVariable.length());

		if (ConcateVariable.length() <= c.length() && ConcateVariable.length() >= 5) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		System.out.println("**********************Question-3**********************");
		// a variable should start with “ab” and b variable should not ends with “yz”

		if (a.startsWith("ab") && b.endsWith("yz") == false) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		System.out.println("**********************Question-4**********************");

		// c variable should contains space and should not contains 9

		if (c.contains(" ") && c.contains("9")==false) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		System.out.println("**********************Question-5**********************");
		// 7th position in a c variable should be y or z and k should be available in
		// the
		// either 10th or 11th positions.

		char seventhchar = c.charAt(6);
		char tenthchar = c.charAt(9);
		char eleventhChar = c.charAt(10);

		if ((seventhchar == 'y' || seventhchar == 'z') && (tenthchar == 'k' || eleventhChar == 'k')) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}

		System.out.println("**********************Question-6**********************");
		// split c variable into multiple strings with “ ”(space) and verify length of
		// the array should be 4 or 5

		String[] arr1 = c.split(" ");
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i].length() == 4 || arr1[i].length() == 5) {
				System.out.println("Pass" + " / " + "Lenght of :  " + arr1[i].length());
			} else {
				System.out.println("Fail" + " / " + "Lenght of :  " + arr1[i].length());
			}
		}
		System.out.println("**********************Question-7**********************");
		// After split verify first string(Index) of the c variable should be same as a
		// variable and should not be same as 3rd string (Index) of the c variable.

		String[] arr2 = c.split(" ");

		if (arr2[0].equals(a) && arr2[3].equals(a) == false) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}
	}

}
