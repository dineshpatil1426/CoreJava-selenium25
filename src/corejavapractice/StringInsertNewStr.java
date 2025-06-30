package corejavapractice;

public class StringInsertNewStr {
	
	static String originalString = "TestingWebsiteAll"; //GeeksGeeks
	static String stringToBeInserted = "For";
	static int index = 6;

	public static String insertString(String originalString, String stringToBeInserted, int index) {
		
		//String newString=originalString.substring(0, index+1)+stringToBeInserted+originalString.substring(index+1);
		
		
		String newString = new String();

		for (int i = 0; i < originalString.length(); i++) {

			newString = newString + originalString.charAt(i);

			if (i == index) {
				newString = newString + stringToBeInserted;
			}
		}
		

		return newString;
	}

	public static void main(String[] args) {

		

		System.out.println("Original String: " + originalString);
		System.out.println("String to be inserted: " + stringToBeInserted);
		System.out.println("String to be inserted at index: " + index);
		
		System.out.println("Modified String: "+ insertString(originalString, stringToBeInserted, index));

	}

}
