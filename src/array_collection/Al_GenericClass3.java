package array_collection;

import java.util.ArrayList;
import java.util.Collections;

public class Al_GenericClass3 {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("grape");
		list.add("watermalon");
		
		
		System.out.println("Returning Element :"+list.get(1));
		
		list.set(1, "Date");
		
		System.out.println("without sorting:"+list);
		
		Collections.sort(list);
		
		for(String fruits:list) {
			System.out.println(fruits);
		}

	}

}
