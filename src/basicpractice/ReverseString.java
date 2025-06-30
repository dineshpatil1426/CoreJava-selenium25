package basicpractice;

public class ReverseString {

	public static void main(String[] args) {
		
		String str= "Geeks";
		
		System.out.println("Before Reverse a String: "+str);
		
		System.out.print("after Reverse a String: ");
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		

	}

}
