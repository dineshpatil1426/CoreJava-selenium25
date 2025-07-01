package basicpractice;

//Find me the first and last occurrence of the letter ‘a’ in amazonaanazzz with index number
public class OccuranceCharWithIndex {

	public static void main(String[] args) {

		String str = "amazonaanazzz";
		char ch = 'a';

		indexOccuranceChar(str, ch);
		
		System.out.println();
		// Main Logic is 
		
		int firstIndex=str.indexOf(ch);
		int lastIndex=str.lastIndexOf(ch);
		
		System.out.println("First occurrence of 'a' is at index: " + firstIndex);
        System.out.println("Last occurrence of 'a' is at index: " + lastIndex);

	}

	public static void indexOccuranceChar(String str, char ch) {
		

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {

				System.out.println(ch + " : " + str.indexOf(ch, i));

			}
			
		}

	}
}
