package corejavapractice;

public class StringFuncations2 {

	public static void main(String[] args) {

		String a = "abcdef";
		String b = "xyz1234";
		String c = "abcxy";

		// 1. Verify length of the A variable should be greater than length of the C
		// variable and should be less than length of the B variable.

		if (a.length() > c.length() && a.length() < b.length()) {
			System.out.println("A Length is greater than C and Less than B");
		} else {
			System.out.println("Condition not met.");
		}

		// 2. A variable should not be same as B variable and C variable

		if (!a.equals(b) && !a.equals(c)) {
			System.out.println("A variable is not same of B variable and C variable");
		} else {
			System.out.println("A variable is same of B variable and C variable");
		}

		// 3. C variable should be same as A variable irrespective of the case.

		if (a.equalsIgnoreCase(c)) {
			System.out.println("C variable contains is same as A variable contains");
		}else {
			System.out.println("C variable contains is not same as A variable contains");
		}

		// 4. A variable should contains cd and should not contains xy

		if (a.contains("cd") && !a.contains("xy")) {
			System.out.println("A variable contains is 'cd' and does not contains 'xy' ");
		} else {
			System.out.println("Condition not met.");
		}

		// 5. Convert B variable into uppercase and verify it should contains “Z”
		// & should not contains “z”

		String upperCase = b.toUpperCase();
		if (upperCase.contains("Z") && !upperCase.contains("z")) {

			System.out.println("B variable contains is 'Z' and  does not contain 'z' ");
		} else {
			System.out.println("Condition not met.");
		}

	}

}
