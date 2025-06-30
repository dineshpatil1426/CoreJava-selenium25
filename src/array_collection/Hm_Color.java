package array_collection;

import java.util.HashMap;
import java.util.Map;

public class Hm_Color {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1,"White");
		map.put(2,"Black");
		map.put(3,"blue");
		map.put(4,"Orange");
		map.put(1,"Silver");
		
		System.out.println(map);
		
		map.clear();
		 boolean val=map.containsKey(3);
		 System.out.println(val);
		 System.out.println(map);
		 System.out.println(map.get(2));
			
		
		for(Map.Entry e:map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
