package practicalformyside;

public class AlphabetCharCheck {

	public static void main(String[] args) {
		
		char ch='a';
		
		if((ch>='a'&& ch<='z') || (ch>='A'&& ch<='Z')) {
			
			System.out.println(ch + " is a alphabet");
		}else {
			System.out.println(ch + " is not a alphabet");
		}

	}

}
