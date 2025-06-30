package basicpractice;

public class SwapTwoString {

	//Write a Java Program to swap two given Strings
	
	public static void main(String[] args) {
		
		String str1="dinesh";
		String str2="patil";
		
		System.out.print("Before Swap String : "+str1+" "+str2);
		System.out.println();
		
		String temp=str1;
		str1=str2;
		str2=temp;
		System.out.print("After Swap String : "+str1+" "+str2);
		
		

	}

}
