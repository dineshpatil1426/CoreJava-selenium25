package practicalquestion;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// write a code to print the number of Characters in the  string ="ttessst@innn123ggg!";
public class StringOfNumber {

	public static void main(String[] args) {

		String str = "ttessst@innn123ggg!";

		int count = str.length();

		System.out.println("Number of characters in the string: " + count);

		String[] arr = str.split("");

		System.out.println("************************");

		Map<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);

		System.out.println("************************");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("1")) {
				System.out.print(arr[i]);
			} else if (arr[i].equals("2")) {
				System.out.print(arr[i]);
			} else if (arr[i].equals("3")) {
				System.out.print(arr[i]);
			}
		}

		System.out.println("************************");

		String str1 = "aabbccdeef";

		LinkedHashMap<Character, Integer> map1 = new LinkedHashMap<>();

		for (char c1 : str1.toCharArray()) {
			map1.put(c1, map1.getOrDefault(c1, 0) + 1);
		}

		for (char c2 : map1.keySet()) {

			if (map1.get(c2) == 1) {

				System.out.println(c2);
			}
		}

	}

}
