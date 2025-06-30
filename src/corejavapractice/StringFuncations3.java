package corejavapractice;

public class StringFuncations3 {

	public static void main(String[] args) {

		String s1 = "Dinesh ";
		String s2 = "DINESH";
		String s3 = "Patil";

		char result = s1.charAt(2);
		System.out.println(result);

		int indexof1 = s2.indexOf("H");
		System.out.println(indexof1);

		System.out.println(s1.concat(s3));

		int result1 = s1.codePointAt(4);
		System.out.println(result1);

		int result2 = s1.codePointBefore(2);
		System.out.println(result2);

		int result3 = s1.codePointCount(0, 6);
		System.out.println(result3);

		System.out.println(s1.compareTo(s2));

		System.out.println(s1.compareToIgnoreCase(s2));

		System.out.println(s1.concat(s3));

		System.out.println(s1.contains("Di"));
		System.out.println(s1.contains("ne"));
		System.out.println(s1.contains("SH"));

		System.out.println(s1.contentEquals("Dinesh"));

		char[] s4 = { 'D', 'i', 'n', 'e', 's', 'h' };
		String s5 = "";
		s5 = String.copyValueOf(s4, 0, 6);
		System.out.println("Returned String: " + s5);

		System.out.println(s1.endsWith("sh"));

		System.out.println(s1.equals(s2));

		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println(s5.isEmpty());

		String friuts = String.join(" ", "Orange", "Apple", "Mango");
		String friuts1 = String.join(" ", "Orange", "Apple", "Mango");
		System.out.println(friuts);
		System.out.println(friuts1);

		String s6 = "Hello";
		System.out.println(s6.replace('l', 'p'));

		String myStr = "I love cats. Cats are very easy to love. Cats are very popular.";
		String regex = "(?i)cat";
		System.out.println(myStr.replaceAll(regex, "dog"));

		String myStr5 = "is W3Schools";
		String regex1 = "is";
		System.out.println(myStr5.replaceFirst(regex1, "at"));

		String myStr6 = "Split a string by spaces, and also punctuation.";
		String regex2 = "[,\\.\\s]";
		String[] myArray = myStr6.split(regex2);
		for (String s : myArray) {
			System.out.println(s);
		}

		String mystr7 = "      DINESH      ";
		System.out.println(mystr7);
		System.out.println(mystr7.trim());

		// ************************************
		String s7 = "GeeksforGeeks:A Computer Science Portal";

		String[] arr1 = s7.split(":");

		for (String a : arr1) {
			System.out.println(a);
		}
		// ********************************
		String s8 = "Geeks.forGeeks.forStudents";

		String[] arr2 = s8.split("[.]");

		for (String a : arr2) {
			System.out.println(a);
		}
		// *****************************
		String s9 = "w1, w2@w3?w4.w5";
		String[] arr3 = s9.split("[,@?.]");

		for (String b : arr3) {
			System.out.println(b);
		}

		// *****************************

		String s = "Geeks+for+Geeks";

		String[] arr4 = s.split("\\+");

		for (String c : arr4) {
			System.out.println(c);
		}

		String str = "how:to::split:::a:string:in:java";
		String[] arrOfStr = str.split(":+");
		for (String a : arrOfStr) {
			System.out.println(a);
		}

		String str1 = "::::";
		String[] arrOfStr1 = str1.split(":");
		System.out.println(arrOfStr1.length);

		String str2 = "java";
		String[] arrOfStr2 = str2.split("");
		for (String a : arrOfStr2) {
			System.out.println(a);
		}

	}

}
