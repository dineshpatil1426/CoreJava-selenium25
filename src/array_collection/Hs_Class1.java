package array_collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hs_Class1 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("one");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Six");
		
		
		System.out.println(set);
		
		Iterator<String> i=set.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
