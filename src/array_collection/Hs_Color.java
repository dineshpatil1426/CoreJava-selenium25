package array_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hs_Color {

	public static void main(String[] args) {
		
		Set<String> set= new HashSet<String>();
		
		set.add("whilte");
		set.add("Black");
		set.add("Orange");
		set.add("Red");
		set.add("Yellow");
		set.add("Red");
		set.add("Black");
		set.add("");
		set.add("");
		
		System.out.println(set);
		Iterator<String> i=set.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
