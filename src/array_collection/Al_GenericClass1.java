package array_collection;

import java.util.ArrayList;

public class Al_GenericClass1 {

	public static void main(String[] args) {
		
		ArrayList<String> list1= new ArrayList();
		
		
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("grape");
		list1.add("watermalon");
		
		// Iterating ArrayList using For-each loop
		
		for(String fruit:list1) {
			System.out.println(fruit);
		}

	}

}
