package practicalformyside;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLengthWithoutLengthM {

	public static void main(String[] args) {

		String str = "testing";

		System.out.println(str.toCharArray().length);
		System.out.println(str.lastIndexOf(""));

		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		int len = m.end();
		System.out.println(len);

		System.out.println(str.split("").length);

		int count = 0;
		for (char c : str.toCharArray()) {
			count++;
		}
		System.out.println(count);
		
		System.out.println(getLength("testing"));
		System.out.println(getstringLength("testingSelenium"));
	}

	public static int getLength(String str) {
		int i=0;
		try {
			while(true) {
				str.charAt(i);
				i++;
			}
		} catch (Exception e) {
			
			return i;
		}
		
		
	}
	
	public static int getstringLength(String str) {
		
		int count=0;
		String[] st=str.split("");
		
		for(String s:st) {
			count+=s.toCharArray().length;
		}
		 return count;
		
	}
}
