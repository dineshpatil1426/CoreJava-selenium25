package array_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapProg {

	public static void main(String[] args) {

		Map<String, Integer> numbers = new HashMap<>();

		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		numbers.put("Five", 5);
		numbers.put("Six", 6);

		System.out.println("keys : " + numbers.keySet());

		System.out.println("Values : " + numbers.values());

		System.out.println("Entries :" + numbers.entrySet());

		System.out.println(numbers.get("Two"));

		int value = numbers.remove("Two");
		System.out.println("Removed Value : " + value);

		System.out.println("-----------------");
		System.out.print("Keys: ");
		for (String key : numbers.keySet()) {
			System.out.print(key);
			System.out.print(", ");
		}
		
		System.out.print("\nValues: ");
		for(Integer values : numbers.values()) {
			System.out.print(values);
			System.out.print(", ");
		}
		System.out.print("\nEntries: ");
		for(Entry<String, Integer> entry: numbers.entrySet()) {
			
			System.out.print(entry);
			System.out.print(", ");
		}
		

	}

}
