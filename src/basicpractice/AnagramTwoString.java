package basicpractice;

import java.util.Arrays;

public class AnagramTwoString {

	public static void main(String[] args) {
		
		String str1 = "Race";
	    String str2 = "Care";
	    
	    
	    str1=str1.toLowerCase();
	    str2=str2.toLowerCase();
	    
	    
	    if(str1.length()==str2.length()) {
	    	
	    	char[] chararray1=str1.toCharArray();
	    	char[] chararray2=str2.toCharArray();
	    	
	    	Arrays.sort(chararray1);
	    	Arrays.sort(chararray2);
	    	
	    	boolean result=Arrays.equals(chararray1, chararray2);
	    	
	    	if(result) {
	    		System.out.println(str1 + " and " + str2 + " are anagram.");
	    	}else {
	    		System.out.println(str1 + " and " + str2 + " are not anagram.");
	    	}
	    	
	    	
	    }else {
	    	System.out.println(str1 + " and " + str2 + " are not anagram.");
	    }
		

	}

}
