package array_collection;

import java.util.ArrayList;
import java.util.Collections;

public class Al_GenericClass4 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(105);
		list.add(104);
		list.add(101);
		list.add(103);
		list.add(102);
		list.add(106);
		
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
