package practicalquestion;

import java.util.HashMap;
import java.util.Map;

public class HighestOccuranceCharCount {

	public static void main(String[] args) {

		String str = "tommorow";

		printHighestCharater(str);
	}

	
	public static void printHighestCharater(String str) {

		HashMap<Character, Integer> highestchar = new HashMap<>();

		for (char ch : str.toCharArray()) {

			if (Character.isWhitespace(ch))
				continue;
			highestchar.put(ch, highestchar.getOrDefault(ch, 0) + 1);
		}

		char maxChar = ' ';
		int maxCount = 0;

		for (Map.Entry<Character, Integer> entry : highestchar.entrySet()) {

			if (entry.getValue() > maxCount) {
				maxChar = entry.getKey();
				maxCount = entry.getValue();
			}
		}

		System.out.println("Character with highest occurrence: '" + maxChar + "' occurred " + maxCount + " times.");

	}

}
