package array_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Al_Practice2 {

	public static void main(String[] args) {
		
		//Java Program to Compare Elements in a Collection.
	
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(5);
		list1.add(18);
		list1.add(4);
		list1.add(6);

		int minValue = Collections.min(list1);

		int maxvalue = Collections.max(list1);

		if (minValue == maxvalue) {
			System.out.println("All elements are equal");
		} else {
			System.out.println("Min value of our list : " + minValue);
			System.out.println("Max value of our list : " + maxvalue);
		}

	}

}
