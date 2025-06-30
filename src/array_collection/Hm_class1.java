package array_collection;

import java.util.HashMap;
import java.util.Map;

public class Hm_class1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map= new HashMap<Integer,String>();
		
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Grapes");
		map.put(4, "Banana");
		map.put(4, "Banana");
		map.put(1, "Mango");
		
		System.out.println(map);
		
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
