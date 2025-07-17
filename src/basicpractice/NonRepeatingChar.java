package basicpractice;

public class NonRepeatingChar {

	public static void main(String[] args) {

		String str = "GeeksForGeeks";
		str = str.toLowerCase();
		String[] arr = str.split("");
		String str1 = "";
		String str2 = "";

		for (int i = 0; i < arr.length; i++) {
			boolean isNonrep = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					str1 += arr[i];
					isNonrep = true;
					continue;
				}
			}
			if (!isNonrep) {
				if(!str1.contains(arr[i])) {
					str2 += arr[i];
					System.out.print(arr[i]);
				}
			}

		}
		System.out.println();
		System.out.println("First non Repeating Char is :  " + str2.charAt(0));
		
		
		

	}

}
