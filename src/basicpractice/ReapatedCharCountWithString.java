package basicpractice;

public class ReapatedCharCountWithString {
	
	// String aabbbcccc to a2b3c4
	static void charaterCount(String str) {
		
		String[] arr = str.split("");
		String str1 = "";

		for (int i = 0; i < arr.length; i++) {
			int charCount = 1;
			boolean isString = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					charCount++;
					if (!str1.contains(arr[i])) {
						isString = true;
						str1 = arr[i];
						continue;
					}
				}

			}

			if (isString) {
				System.out.print(str1 + "" + charCount);
			}

		}
	
	} 
	
	// String a2b3c4 to aabbbcccc
	static void charAddCountOfNum(String str1) {
		
		for (int i = 0; i < str1.length(); i++) {
			
			if(Character.isAlphabetic(str1.charAt(i))) {
				System.out.print(str1.charAt(i));
			}else {
				int count=Character.getNumericValue(str1.charAt(i));
				for(int j=1;j<count;j++) {
					System.out.print(str1.charAt(i-1));
				}
				
			}	
			
			}
		
	}
	


	public static void main(String[] args) {

		String str = "aabbbcccc";
		charaterCount(str);
		System.out.println();
		String str1="a2b3c4";
		charAddCountOfNum(str1);
		
	}

}
