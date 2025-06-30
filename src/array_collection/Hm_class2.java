package array_collection;

import java.util.HashMap;

public class Hm_class2 {

	public static void main(String[] args) {
		
		
		HashMap<String , Integer> map1= new HashMap<String,Integer>();
		
		map1.put("a", 101);
		map1.put("b", 102);
		map1.put("c", 103);
		map1.put("d", 104);
		map1.put("e", 105);
		
		map1.remove("d");
		
		System.out.println(map1);
		boolean val=map1.containsKey("f");
		System.out.println(val);
		System.out.println(map1);
		System.out.println(map1.get("c"));

	}

}
