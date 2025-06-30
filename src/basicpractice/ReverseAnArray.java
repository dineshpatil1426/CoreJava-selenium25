package basicpractice;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		
		char[] s = { 'a', 'b', 'c', 'd', 'e' };
		
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");
		}
	}

}
