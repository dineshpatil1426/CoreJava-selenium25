package basicpractice;

public class PalindromeString {

	public static void main(String[] args) {
		 
		
		String str="racecar";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			rev+=ch;
		}
		 
		if(str.equals(rev)) {
			System.out.println("It's Palindrome String ");
		}else {
			System.out.println("It's not Palindrome String ");
		}

	}

}
