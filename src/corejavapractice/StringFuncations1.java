package corejavapractice;

public class StringFuncations1 {

	public static void main(String[] args) {
		
		String s1="Dinesh QA ";
		String s2="DINESH QA";
		String s3="patil";
		String s4="     DINESH QA      ";
		
		
		System.out.println(s1.length());
		System.out.println(s1.startsWith("D"));
		System.out.println(s1.endsWith("QA"));
		System.out.println(s2.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("Dinesh"));
		System.out.println(s1.concat(s3));
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf("s"));
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s1.replace("QA", "AutomationQA"));
		
		
		
		
		

	}

}
